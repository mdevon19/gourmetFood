package com.example.gourmetFoodBackend.controller;

import com.example.gourmetFoodBackend.entity.FoodItem;
import com.example.gourmetFoodBackend.entity.Order;
import com.example.gourmetFoodBackend.service.FoodItemService;
import com.example.gourmetFoodBackend.service.OrderCheckService;
import com.example.gourmetFoodBackend.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/GourmetFood")
@CrossOrigin(origins = "*", allowedHeaders = "*", exposedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class gourmetFoodController {


    @Autowired
    FoodItemService foodItemService;

    @Autowired
    OrderService orderService;

    @Autowired
    OrderCheckService orderCheckService;

    @CrossOrigin
    @GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllItems(){
        return new ResponseEntity(foodItemService.getAllFood(), HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping(path= "/addOrder", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addOrder(@RequestBody Order order) {

        List<FoodItem> items = order.getItemsOrdered();
        for(FoodItem item: items){
            System.out.println(item.toString());
        }
        System.out.println(order.toString());
        orderService.addOrder(order);
        return new ResponseEntity("We all good", HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping(path = "/orderCheck")
    public ResponseEntity getOrderCheck(@RequestParam int tableNumber){
        return new ResponseEntity(orderService.getOrderByTableNumber(tableNumber), HttpStatus.OK);
    }
}
