import { Time } from "@angular/common";
import { Timestamp } from "rxjs";
import { FoodItem } from "./FoodItem";

export class Order{
    tableNumber: number;
    totalPrice: number;
    timePlaced: Date;
    itemsOrdered: FoodItem[];
}