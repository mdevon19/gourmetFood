package com.example.gourmetFoodBackend.dto;

import com.example.gourmetFoodBackend.entity.FoodItem;

public class FoodItemDTO {

    int itemId;
    String itemName;
    String category;
    double price;
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

    public FoodItemDTO entityToDTO(FoodItem foodItem){
        FoodItemDTO foodItemDTO = new FoodItemDTO();
        foodItemDTO.setItemId(foodItem.getItemId());
        foodItemDTO.setItemName(foodItem.getItemName());
        foodItemDTO.setCategory(foodItem.getCategory());
        foodItemDTO.setItemDescription(foodItem.getItemDescription());
        foodItemDTO.setPrice(foodItem.getPrice());
        return foodItemDTO;
    }

    public FoodItem dtoToEntity(FoodItemDTO foodItemDTO){
        FoodItem foodItem = new FoodItem();
        foodItem.setItemId(foodItemDTO.getItemId());
        foodItem.setItemName(foodItemDTO.getItemName());
        foodItem.setCategory(foodItemDTO.getCategory());
        foodItem.setItemDescription(foodItemDTO.getItemDescription());
        foodItem.setPrice(foodItemDTO.getPrice());
        return  foodItem;
    }

}
