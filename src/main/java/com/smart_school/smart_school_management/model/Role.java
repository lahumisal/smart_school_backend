package com.smart_school.smart_school_management.model;

import com.smart_school.smart_school_management.model.enums.Roles;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleId;

    @Enumerated(EnumType.STRING)
    @Column(unique = true, nullable = false)
    private Roles roleName;
}

