package com.example.demo.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController {
	@PostMapping("/user")
	public String addUserDetails() {
		return "index";
		
	}

}
