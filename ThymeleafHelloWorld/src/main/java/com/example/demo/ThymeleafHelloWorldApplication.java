package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThymeleafHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafHelloWorldApplication.class, args);
		System.out.println("Thymeleaf Hello World");
	}

}
