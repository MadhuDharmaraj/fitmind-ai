package com.madhu.fitmind.model;

public class User {
    public Long id;
    public String name;
    public int age;
    public UserType userType;

    public User(Long id, String name, int age, UserType userType) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.userType = userType;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public UserType getUserType() {
        return userType;
    }
}
