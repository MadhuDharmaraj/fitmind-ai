package com.madhu.fitmind.dto;

public class UserResponse {
    private String name;
    private Long id;
    private String userType;
    private String recommendation;

    public UserResponse(String name, Long id, String userType, String recommendation) {
        this.name = name;
        this.id = id;
        this.userType = userType;
        this.recommendation = recommendation;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public String getUserType() {
        return userType;
    }

    public String getRecommendation() {
        return recommendation;
    }
}
