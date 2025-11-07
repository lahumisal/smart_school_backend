package com.smart_school.smart_school_management.model;

import com.smart_school.smart_school_management.model.enums.Roles;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@RequiredArgsConstructor
public class Users {

    @Id
    @Column(name = "userId")
    private Long userId;

    @Column(name = "userName")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private Roles role;

    @Column(name = "email")
    private String email;

}
