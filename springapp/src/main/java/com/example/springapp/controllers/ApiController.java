package com.example.springapp.controllers;
import org.springframework.web.bind.RestController;
import org.springframework.web.bind.GetMapping;
@RestController
public class ApiController {
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome String Boot!";
    }
}
