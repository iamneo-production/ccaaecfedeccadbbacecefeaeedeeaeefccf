package com.example.springapp.Controllers;
import org.springframework.web.bind.RestController;

@RestController
public class ApiController {
    @GetMapping("disp")
    public String display(){
        return "/Welcome";
    }
}
