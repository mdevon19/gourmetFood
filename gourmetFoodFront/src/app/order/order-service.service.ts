import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { FoodItem } from '../shared/FoodItem';
import { Order } from '../shared/Order';

@Injectable({
  providedIn: 'root'
})
export class OrderServiceService {

  constructor(private http: HttpClient) { }

  getFoodURL: string = 'http://localhost:8080/GourmetFood/all';
  postOrderURL: string = 'http://localhost:8080/GourmetFood/addOrder'

  public getData(){
    return this.http.get<FoodItem []>(this.getFoodURL);
  }

  public postOrder(order: Order) {
    this.http.post<Order>(this.postOrderURL, order);
  }
}
