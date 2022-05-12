package com.heydieproject.cronjobexamplespring.controller;

import com.heydieproject.cronjobexamplespring.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import src.main.java.com.heydieproject.cronjobexamplespring.Entity.User;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> createUser() {

        User serviceUser = userService.createUser();
        return ResponseEntity.ok(serviceUser);

    }

    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }
}
