package com.technosignia.Realestate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class RealestateApplication {
	
	@GetMapping("/")
	public String display() {
		return "This my spring boot project";
	}

	public static void main(String[] args) {
		SpringApplication.run(RealestateApplication.class, args);
	}

}
