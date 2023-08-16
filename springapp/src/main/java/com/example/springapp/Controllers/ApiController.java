package com.example.springapp.Controllers;
import org.springframework.web.bind.RestController;
import org.springframework.web.bind.GetMapping;
@RestController
public class ApiController {
    @GetMapping("disp")
    public String display(){
        return "/Welcome";
    }
}
