package com.madhu.fitmind.dto;

public class UserResponse {
    private String name;
    private Long id;
    private String userType;

    public UserResponse(String name, Long id, String userType) {
        this.name = name;
        this.id = id;
        this.userType = userType;
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
}
