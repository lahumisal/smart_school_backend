package com.smart_school.smart_school_management.repository;

import com.smart_school.smart_school_management.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, Long> {

    Users findByUserName(String userName);

    Users findByEmail(String email);

    Users getUserByUserId(Long userId);

    Users getUserByEmail(String email);

}
