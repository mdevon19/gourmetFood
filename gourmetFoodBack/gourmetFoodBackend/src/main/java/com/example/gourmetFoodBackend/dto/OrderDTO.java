package com.example.gourmetFoodBackend.dto;

import com.example.gourmetFoodBackend.entity.FoodItem;
import com.example.gourmetFoodBackend.entity.Order;

import java.util.List;

public class OrderDTO {

    int tableNumber;
    double totalPrice;
    List<FoodItem> foodItems;

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<FoodItem> getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(List<FoodItem> foodItems) {
        this.foodItems = foodItems;
    }

    public Order dtoToEntity(OrderDTO orderDTO){
        Order order = new Order();
        order.setTableNumber(order.getTableNumber());
        order.setTotalPrice(orderDTO.getTotalPrice());
        order.setItemsOrdered(orderDTO.getFoodItems());
        return order;
    }
}
