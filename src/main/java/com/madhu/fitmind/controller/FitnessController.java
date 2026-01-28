package com.madhu.fitmind.controller;

import com.madhu.fitmind.dto.UserRequest;
import com.madhu.fitmind.dto.UserResponse;
import com.madhu.fitmind.model.User;
import com.madhu.fitmind.model.UserType;
import com.madhu.fitmind.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/fitness")
public class FitnessController {
    private final UserService userService;
    public FitnessController(UserService userService)
    {
        this.userService = userService;
    }
    @PostMapping("/users")
    public UserResponse createUser(@RequestBody UserRequest request) {

        User user = userService.createUser(request);
        return new UserResponse(user.getName(),
                user.getId(),
                user.getUserType().toString());
    }
}
