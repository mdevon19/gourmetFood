package com.example.gourmetFoodBackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.websocket.ClientEndpoint;

@Entity
public class FoodItem {

    @Id
    @Column(name = "itemId")
    int itemId;

    @Column(name = "itemName")
    String itemName;

    @Column(name = "category")
    String category;

    @Column(name = "price")
    double price;

    @Column(name = "itemDescription")
    String itemDescription;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
}
