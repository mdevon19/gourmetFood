package com.example.gourmetFoodBackend.service;


import com.example.gourmetFoodBackend.entity.FoodItem;
import com.example.gourmetFoodBackend.repository.FoodItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodItemService {

    @Autowired
    FoodItemRepository foodItemRepository;

    public List<FoodItem> getAllFood(){
        return foodItemRepository.findAll();
    }
}
