package com.example.gourmetFoodBackend.service;

import com.example.gourmetFoodBackend.dto.OrderDTO;
import com.example.gourmetFoodBackend.entity.Order;
import com.example.gourmetFoodBackend.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public void addOrder(OrderDTO orderDTO){
        orderRepository.save(orderDTO.dtoToEntity(orderDTO));
    }
}
