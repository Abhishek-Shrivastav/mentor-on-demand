package com.cgt.mentor.role;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cgt.mentor")
public class RoleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoleApplication.class, args);
		
		System.out.println("Server is running...");
	}
}
