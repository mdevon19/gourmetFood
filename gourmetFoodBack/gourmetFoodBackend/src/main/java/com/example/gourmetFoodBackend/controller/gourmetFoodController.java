package com.example.gourmetFoodBackend.controller;

import com.example.gourmetFoodBackend.dto.OrderDTO;
import com.example.gourmetFoodBackend.service.FoodItemService;
import com.example.gourmetFoodBackend.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/GourmetFood")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class gourmetFoodController {


    @Autowired
    FoodItemService foodItemService;

    @Autowired
    OrderService orderService;

    @CrossOrigin
    @GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllItems(){
        return new ResponseEntity(foodItemService.getAllFood(), HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping(path= "/addOrder", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addOrder(@RequestBody OrderDTO orderDTO) {
        orderService.addOrder(orderDTO);
    }
}
