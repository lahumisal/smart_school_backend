package com.smart_school.smart_school_management.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/home")
public class HomeController {

    @GetMapping
    public String home() {
        return "Home";
    }

    @PostMapping("/login")
    public String login() {
        return "Login";
    }

    @PostMapping("/logout")
    public String logout() {
        return "Logout";
    }

}
