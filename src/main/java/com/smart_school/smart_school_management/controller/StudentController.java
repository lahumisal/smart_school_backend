package com.smart_school.smart_school_management.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @GetMapping
    public String student() {
        return "Student";
    }

}
