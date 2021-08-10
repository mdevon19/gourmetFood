import { Component, OnInit } from '@angular/core';
import { Order } from '../shared/Order';
import { WaiterServiceService } from '../waiter-service.service';

@Component({
  selector: 'app-waiter-component',
  templateUrl: './waiter-component.component.html',
  styleUrls: ['./waiter-component.component.css']
})
export class WaiterComponentComponent implements OnInit {

  response: String;
  orders: Order[]
  constructor(private waiterService: WaiterServiceService) { }

  ngOnInit(): void {
    this.waiterService.getAllOrders().subscribe(data => {this.orders = data})
  }

  removeOrder(tableNumber: Number){
    console.log(tableNumber);
    this.waiterService.deleteOrder(tableNumber).subscribe(data => this.response = data);
    this.orders.forEach((value,index) => {
      if(value.tableNumber==tableNumber) {
        this.orders.splice(index,1);
      }
    });
  }



}
