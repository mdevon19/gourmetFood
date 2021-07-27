import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FoodItem } from '../shared/FoodItem';
import { Order } from '../shared/Order';

@Component({
  selector: 'app-checkout',
  templateUrl: './checkout.component.html',
  styleUrls: ['./checkout.component.css']
})
export class CheckoutComponent implements OnInit {

  constructor(private router: Router) { }

  order: Order;

  ngOnInit(): void {
    this.order = JSON.parse(localStorage.getItem("order"));
  }

  payed() {
    alert("Thanks. Please visit us again");
    localStorage.clear();
    this.router.navigateByUrl('home');


  }

}
