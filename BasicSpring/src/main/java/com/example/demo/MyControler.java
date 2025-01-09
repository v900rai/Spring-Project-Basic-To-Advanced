package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MyControler {
	@RequestMapping("/vishal")
	public String getName() {
		return "hello vishal rai";
		
	}
	@GetMapping("/v")
	public int age() {
		return 101;
	}
	
	

}
