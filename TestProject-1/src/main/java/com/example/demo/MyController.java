package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/vv")
	public String Hello() {
		return "<h1>hello vishal rai</h1>";
				
	}

}
