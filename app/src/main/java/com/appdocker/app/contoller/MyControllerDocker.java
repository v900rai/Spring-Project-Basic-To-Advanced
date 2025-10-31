package com.appdocker.app.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyControllerDocker {


    @GetMapping("/app")
    public String getAll(){
        return "Hello World!";
    }
}
