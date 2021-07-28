package com.example.gourmetFoodBackend.controller;

import com.example.gourmetFoodBackend.dto.OrderDTO;
import com.example.gourmetFoodBackend.entity.Order;
import com.example.gourmetFoodBackend.service.FoodItemService;
import com.example.gourmetFoodBackend.service.OrderService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping(path = "/GourmetFood")
@CrossOrigin(origins = "*", allowedHeaders = "*", exposedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST})
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
    public ResponseEntity addOrder(@RequestBody Order order) {
        orderService.addOrder(order);
        return new ResponseEntity("We all good", HttpStatus.OK);
    }

    @GetMapping(path = "getTableOrder", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllOrders() {
        return new ResponseEntity(orderService.getAllOrders(), HttpStatus.OK);
    }
}
