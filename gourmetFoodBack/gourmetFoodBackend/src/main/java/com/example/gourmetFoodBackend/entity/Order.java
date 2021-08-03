package com.example.gourmetFoodBackend.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity(name = "orderTable")
public class Order {

    @Id
    @Column(name = "tableNumber")
    int tableNumber;

    @Column(name = "totalPrice")
    double totalPrice;

    @Column(name = "timePlaced")
    LocalDateTime timePlaced;

    @Column(name = "itemsOrdered")
    @OneToMany
    List<FoodItem> itemsOrdered;

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public LocalDateTime getTimePlaced() {
        return timePlaced;
    }

    public void setTimePlaced(LocalDateTime timePlaced) {
        this.timePlaced = timePlaced;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<FoodItem> getItemsOrdered() {
        return itemsOrdered;
    }

    public void setItemsOrdered(List<FoodItem> itemsOrdered) {
        this.itemsOrdered = itemsOrdered;
    }

    @Override
    public String toString() {
        return "Order{" +
                "tableNumber=" + tableNumber +
                ", totalPrice=" + totalPrice +
                ", foodItems=" + itemsOrdered.toString() +
                '}';
    }
}
