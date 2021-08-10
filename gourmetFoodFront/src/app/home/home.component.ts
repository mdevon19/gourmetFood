import { Component, Injectable, Input, OnInit } from '@angular/core';
import { waitForAsync } from '@angular/core/testing';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { BooleanServiceService } from '../boolean-service.service';
import { GetOrderDetailsServiceService } from '../get-order-details-service.service';
import { Order } from '../shared/Order';
import { OrderCheck } from '../shared/OrderCheck';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private router: Router, private booleanService: BooleanServiceService, private getOrderDetailService: GetOrderDetailsServiceService) { }

  tableNumberForm = new FormGroup({
    userTableNumber: new FormControl('')
  })

  orderCheck: Order;
  timeOrderCheck: Date;
  timeElapsed;
  offset;


  submittedOrder: boolean;

  ngOnInit(): void {
    this.offset = new Date().getTimezoneOffset();
    window.scroll(0,0)
    this.CheckBoolValue();
  }

  goToWaiter() {
    this.router.navigateByUrl('waiter');
  }

  goToOrder(): void{
    this.router.navigateByUrl('order');
  }

  goToCheckOut() {
    this.router.navigateByUrl('checkout');
  }

  CheckBoolValue(){
    if(localStorage.getItem('orderSubmitted') == 'true'){
      this.submittedOrder = true;
      localStorage.removeItem('orderSubmitted')
    } else {
      this.submittedOrder = false;
    }
  }

  onSubmit(){
    this.getOrderDetailService.getOrderDetails(this.tableNumberForm.value.userTableNumber).subscribe(orderCheck => {this.orderCheck = orderCheck})
    
  }

  calculateDiff(data){
    let date = new Date(data.sent);
    let currentDate = new Date();

    let days = Math.floor((currentDate.getTime() - date.getTime()));
    return days;
  }

  

}
