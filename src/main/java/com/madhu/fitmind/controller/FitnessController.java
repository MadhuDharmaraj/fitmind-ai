package com.madhu.fitmind.controller;

import com.madhu.fitmind.dto.UserRequest;
import com.madhu.fitmind.dto.UserResponse;
import com.madhu.fitmind.model.User;
import com.madhu.fitmind.model.UserType;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/fitness")
public class FitnessController {
    private final AtomicLong counter = new AtomicLong();

    @PostMapping("/users")
    public UserResponse createUser(@RequestBody UserRequest request) {

        UserType userType = UserType.valueOf(request.getUserType().toUpperCase());

        User user = new User(
                counter.incrementAndGet(),
                request.getName(),
                request.getAge(),
                userType
        );

        return new UserResponse(
                user.getName(),
                user.getId(),
                user.getUserType().name()
        );
    }
}
