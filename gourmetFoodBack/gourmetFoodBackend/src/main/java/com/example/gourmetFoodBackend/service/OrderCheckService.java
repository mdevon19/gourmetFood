package com.example.gourmetFoodBackend.service;

import com.example.gourmetFoodBackend.entity.OrderCheck;
import com.example.gourmetFoodBackend.repository.OrderCheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderCheckService {

    @Autowired
    OrderCheckRepository orderCheckRepository;

    public OrderCheck getOrderCheckByTableNumber(String tableNumber){

            return orderCheckRepository.findByTableNumber(tableNumber);

    }
}
