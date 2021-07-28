import { ThrowStmt } from '@angular/compiler';
import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { Router } from '@angular/router';
import { BooleanServiceService } from '../boolean-service.service';
import { HomeComponent } from '../home/home.component';
import { FoodItem } from '../shared/FoodItem';
import { Order } from '../shared/Order';
import { OrderServiceService } from './order-service.service';

@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.css']
})
export class OrderComponent implements OnInit {

  message: string;
  response: string;
  orderTotal: number = 0;
  order: Order = new Order;
  cartHasItems: boolean;
  popup: boolean = false
  itemCart: FoodItem[] = [];
  FoodArray: FoodItem[];

  constructor(private OrderService: OrderServiceService, private router: Router, private booleanService: BooleanServiceService) { }

  

  ngOnInit(): void {
    this.getAllFood();
  }

  

  getAllFood(){
    this.OrderService.getData().subscribe(data => {this.FoodArray = data});
  }

  addItem(item: FoodItem){
    this.itemCart.push(item)
    this.cartHasItems = true;
  }

  removeItem(citem: FoodItem){
    this.itemCart.forEach((value,index) => {
      if(value==citem) {
        this.itemCart.splice(index,1);
      }
    });
    if(this.itemCart.length <= 0){
      this.cartHasItems = false;
    }
  }

  orderNow(){
    this.order.tableNumber = Math.floor(Math.random() * 20) + 1;
    this.itemCart.forEach((value, index) => {
      this.orderTotal = this.orderTotal + value.price;
    });
    this.order.totalPrice = this.orderTotal;
    this.order.itemsOrdered = this.itemCart;

    

    this.OrderService.postOrder(this.order)
          .subscribe(message => this.message = message);

    console.log(this.message)

    alert("Order is successfully placed")

    localStorage.setItem("order", JSON.stringify(this.order));
    localStorage.setItem("orderSubmitted", "true");
    this.router.navigateByUrl('home');
  }

  viewCart(){
    window.scroll(0,0);
  }


}
