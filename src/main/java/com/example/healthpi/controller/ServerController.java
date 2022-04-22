package com.example.healthpi.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {
    @GetMapping("/")
    public String welcome(){
        return "welcome to Health Pi";
    }
}
