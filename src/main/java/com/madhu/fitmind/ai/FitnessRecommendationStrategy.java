package com.madhu.fitmind.ai;

import com.madhu.fitmind.model.User;

public interface FitnessRecommendationStrategy {
    String recommend(User user);
}
