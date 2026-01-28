package com.madhu.fitmind.ai;

import com.madhu.fitmind.model.User;
import org.springframework.stereotype.Component;

@Component
public class KidFitnessStrategy implements FitnessRecommendationStrategy{
    @Override
    public String recommend(User user) {
        return "Kids fun Activities: Swimming, Skipping rope, jumping jacks and outdoor play(30 mins)";
    }
}
