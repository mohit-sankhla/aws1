package com.mohit.aws1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Aws1Application {
	@GetMapping("/")
	public String home() {
		return "Welcome to the AWS Deployment";
	}

	public static void main(String[] args) {
		SpringApplication.run(Aws1Application.class, args);
	}

}
