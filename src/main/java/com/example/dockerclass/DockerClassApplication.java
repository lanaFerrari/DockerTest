package com.example.dockerclass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerClassApplication {

	@GetMapping("/hello")
	public String getGreeting(){
		return "Hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerClassApplication.class, args);
	}

}
