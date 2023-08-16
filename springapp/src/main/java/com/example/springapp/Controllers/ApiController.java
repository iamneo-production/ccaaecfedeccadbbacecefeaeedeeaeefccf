package com.example.springapp;
import org.springframework.web.bind.RestController;
import org.springframework.web.bind.GetMapping;
@RestController
public class ApiController {
    @GetMapping("disp")
    public String Welcome(){
        return "Welcome String Boot";
    }
}
