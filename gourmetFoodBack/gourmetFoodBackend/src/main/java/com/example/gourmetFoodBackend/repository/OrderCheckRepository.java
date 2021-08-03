package com.example.gourmetFoodBackend.repository;

import com.example.gourmetFoodBackend.entity.OrderCheck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderCheckRepository extends JpaRepository<OrderCheck, Integer> {

    public OrderCheck findByTableNumber(String tableNumber);

}
