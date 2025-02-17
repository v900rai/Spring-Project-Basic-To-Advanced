package com.example.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/rai")
    public String sayHello(Model model) {
    	System.out.println("I am here");
        model.addAttribute("mas1", "Thymeleaf Hello World");
        model.addAttribute("mas2", "Hello Vishal Rai");
        return "HelloWorld";  // 
    }
}
