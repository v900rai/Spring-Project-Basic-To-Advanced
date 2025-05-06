package org.vishalrai.Jounral.app.myController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Health_check {
    @GetMapping("/healthCheck")
    public String helthCheck(){
        return "ok";
    }
}
