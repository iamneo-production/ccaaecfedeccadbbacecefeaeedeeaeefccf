package com.example.springapp;

import org.springframework.web.bind.annotation.GetMapping;

@RestController;
public class ApiController {
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome String Boot!";
    }
}
