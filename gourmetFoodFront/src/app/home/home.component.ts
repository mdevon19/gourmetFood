import { Component, Injectable, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { BooleanServiceService } from '../boolean-service.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private router: Router, private booleanService: BooleanServiceService) { }


  submittedOrder: boolean;

  ngOnInit(): void {
    this.CheckBoolValue();
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

  

}
