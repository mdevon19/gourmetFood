package com.example.gourmetFoodBackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;

@Entity(name = "OrderCheck")
public class OrderCheck {

    @Id
    @Column(name = "tableNumber")
    int tableNumber;

    @Column(name = "timePlaced")
    Time timePlace;

    @Column(name = "estimatedMinLeft")
    int estimatedMinLeft;
}
