package com.example.gourmetFoodBackend.controller;

import com.example.gourmetFoodBackend.service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/GourmetFood")
public class gourmetFoodController {


    @Autowired
    FoodItemService foodItemService;

    @GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllItems(){
        return new ResponseEntity(foodItemService.getAllFood(), HttpStatus.OK);
    }
}
