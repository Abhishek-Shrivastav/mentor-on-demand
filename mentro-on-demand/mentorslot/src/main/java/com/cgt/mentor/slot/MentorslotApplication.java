package com.cgt.mentor.slot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cgt.mentor")
public class MentorslotApplication {

	public static void main(String[] args) {
		SpringApplication.run(MentorslotApplication.class, args);
		
		System.out.println("Server is running...");
	}
}
