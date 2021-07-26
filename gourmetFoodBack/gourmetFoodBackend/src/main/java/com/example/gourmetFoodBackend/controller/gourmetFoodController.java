package com.example.gourmetFoodBackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class gourmetFoodController {


    @GetMapping()
    public String tester(){
        return "It works!";
    }
}
