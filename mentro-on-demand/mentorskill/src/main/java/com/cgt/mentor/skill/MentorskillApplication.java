package com.cgt.mentor.skill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cgt")
public class MentorskillApplication {

	public static void main(String[] args) {
		SpringApplication.run(MentorskillApplication.class, args);
		
		System.out.println("Server is running...");
	}
}