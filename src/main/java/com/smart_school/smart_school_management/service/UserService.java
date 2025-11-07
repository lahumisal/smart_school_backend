package com.smart_school.smart_school_management.service;

import com.smart_school.smart_school_management.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

}
