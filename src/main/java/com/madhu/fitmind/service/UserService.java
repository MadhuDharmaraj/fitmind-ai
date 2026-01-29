package com.madhu.fitmind.service;

import com.madhu.fitmind.ai.AdultFitnessStrategy;
import com.madhu.fitmind.ai.KidFitnessStrategy;
import com.madhu.fitmind.dto.UserRequest;
import com.madhu.fitmind.exception.InvalidUserException;
import com.madhu.fitmind.model.User;
import com.madhu.fitmind.model.UserType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class UserService {
    private final AtomicLong counter = new AtomicLong();
    private final KidFitnessStrategy kidStrategy;
    private final AdultFitnessStrategy adultStrategy;
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    public UserService(KidFitnessStrategy kidStrategy,
                       AdultFitnessStrategy adultStrategy) {
        this.kidStrategy = kidStrategy;
        this.adultStrategy = adultStrategy;
    }
    public UserCreationResult createUser(UserRequest request) {

        UserType userType = UserType.valueOf(request.getUserType().toUpperCase());

        // Business rules
        if (userType == UserType.KID && request.getAge() > 16) {
            throw new InvalidUserException("Kids must be 16 or younger");
        }

        if (userType == UserType.ADULT && request.getAge() < 17) {
            throw new InvalidUserException("Adults must be 17 or older");
        }
        User user = new User(
                counter.incrementAndGet(),
                request.getName(),
                request.getAge(),
                userType
        );
        // AI Recommendation (strategy-based)
        String recommendation = (userType == UserType.KID) ? kidStrategy.recommend(user) : adultStrategy.recommend(user);

        logger.info("AI recommendation generated for userType={}: {}", userType, recommendation);
        return new UserCreationResult(user, recommendation);
    }
}
