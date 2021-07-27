package com.example.gourmetFoodBackend.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "orderTable")
public class Order {

    @Id
    @Column(name = "tableNumber")
    int tableNumber;

    @Column(name = "totalPrice")
    double totalPrice;

    @Column(name = "foodItems")
    @OneToMany
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
}
