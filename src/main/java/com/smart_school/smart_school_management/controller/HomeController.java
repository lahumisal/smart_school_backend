package com.smart_school.smart_school_management.controller;

import com.smart_school.smart_school_management.model.request.LoginRequest;
import com.smart_school.smart_school_management.model.response.LoginResponse;
import com.smart_school.smart_school_management.service.UserService;
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

    @GetMapping
    public String home() {
        return "Home";
    }


}
