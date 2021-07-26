package com.example.gourmetFoodBackend.repository;

import com.example.gourmetFoodBackend.entity.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodItemRepository extends JpaRepository<FoodItem, Integer> {

    public List<FoodItem> findByCategory(String category);
}
