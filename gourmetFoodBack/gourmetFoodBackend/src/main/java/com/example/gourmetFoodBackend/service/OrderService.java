package com.example.gourmetFoodBackend.service;

import com.example.gourmetFoodBackend.entity.Order;
import com.example.gourmetFoodBackend.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public Order addOrder(Order order){
        return orderRepository.save(order);
    }

    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

    public Order getOrderByTableNumber(int tableNumber){
        return orderRepository.findByTableNumber(tableNumber);
    }

    public String clearTable(int tableNumber){

        try{
            orderRepository.delete(orderRepository.findByTableNumber(tableNumber));
            return "Success!";
        }catch(Exception e){
            return e.getMessage();
        }

    }
}
