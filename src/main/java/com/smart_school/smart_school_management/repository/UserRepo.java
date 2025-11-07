package com.smart_school.smart_school_management.repository;

import com.smart_school.smart_school_management.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, Long> {

    Users findByUsername(String username);

    Users findByEmail(String email);

    Users getUserById(Long id);

    Users getUserByEmail(String email);

}
