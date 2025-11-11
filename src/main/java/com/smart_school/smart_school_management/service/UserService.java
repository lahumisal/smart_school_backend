package com.smart_school.smart_school_management.service;

import com.smart_school.smart_school_management.model.Users;
import com.smart_school.smart_school_management.model.request.LoginRequest;
import com.smart_school.smart_school_management.model.response.LoginResponse;
import com.smart_school.smart_school_management.model.response.LoginUser;
import com.smart_school.smart_school_management.repository.UserRepo;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private JwtService  jwtService;

    @Autowired
    public AuthenticationManager authManager;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public LoginResponse loginUser(LoginRequest loginRequest) {
        log.info("verifying the user");

        Authentication authentication = authManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.getUsername(),
                        loginRequest.getPassword()
                )
        );
        if (!authentication.isAuthenticated()) {
            return null;
        }

        if (authentication.isAuthenticated()) {
            log.info("user logged in");

            // Get user from database to retrieve full user details
            Users dbUser = userRepo.findByUserName(loginRequest.getUsername());

            // Generate JWT token
            String token = jwtService.generateToken(loginRequest.getUsername());

            LoginUser loginUser = new LoginUser(
                    dbUser.getUserName(),
                    dbUser.getEmail(),
                    dbUser.getRole().toString()
            );

            if (dbUser == null) {
                log.info("user not found====> DB null");
                return null;
            }
            // Build login response
            LoginResponse loginResponse = new LoginResponse();
            loginResponse.setToken(token);
            loginResponse.setUser(loginUser);

            return loginResponse;
        }
        throw new RuntimeException("Invalid username or password");
    }
}
