package com.example.gourmetFoodBackend.repository;

import com.example.gourmetFoodBackend.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

    public Order findByTableNumber(int tableNumber);

}
