import { FoodItem } from "./FoodItem";

export class Order{
    tableNumber: number;
    totalPrice: number;
    itemsOrdered: FoodItem[];
}