package com.smart_school.smart_school_management.controller;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/home")
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String home() {
        return "Home";
    }

    @PostMapping("/register")
    public ResponseEntity registerUser(@Valid @RequestBody RegisterUser registerUser){
        return null;
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@Valid @RequestBody LoginRequest loginRequest) {
        log.info("Login Request: {}", loginRequest);
        LoginResponse response=userService.loginUser(loginRequest);
        if (response != null) {
            return ResponseEntity.ok(response);
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }

    @PostMapping("/logout")
    public String logout() {
        return "Logout";
    }



}
