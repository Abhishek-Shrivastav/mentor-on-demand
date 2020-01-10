package com.mentorondemand;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class MentorondemandApplication {

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemp()
	{
		return new RestTemplate();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MentorondemandApplication.class, args);
		
		System.out.println("Application server is running...");
	}
}
