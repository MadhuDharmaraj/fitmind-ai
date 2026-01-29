package com.madhu.fitmind.service;

import com.madhu.fitmind.model.User;

public class UserCreationResult {
    private final User user;
    private final String recommendation;

    public UserCreationResult(User user, String recommendation) {
        this.user = user;
        this.recommendation = recommendation;
    }

    public User getUser() {
        return user;
    }

    public String getRecommendation() {
        return recommendation;
    }
}
