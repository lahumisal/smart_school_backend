package com.smart_school.smart_school_management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SmartSchoolManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartSchoolManagementApplication.class, args);
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

        System.out.println("Principal: " + encoder.encode("Principal"));
        System.out.println("Teacher: " + encoder.encode("Teacher"));
        System.out.println("Student: " + encoder.encode("Student"));
	}

}
