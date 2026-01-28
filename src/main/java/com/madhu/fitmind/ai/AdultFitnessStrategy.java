package com.madhu.fitmind.ai;

import com.madhu.fitmind.model.User;
import org.springframework.stereotype.Component;

@Component
public class AdultFitnessStrategy implements FitnessRecommendationStrategy{
    @Override
    public String recommend(User user) {
        return "Moderate Activities: Gym, brisk walking, strength training and stretching 45 mins";
    }
}
