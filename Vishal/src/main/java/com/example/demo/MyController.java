package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/vv12")
	public String getName() {
		return "hello vishal rai";
		
	}
	@GetMapping("/rai")
	public int age() {
		return 101;
	}
}


