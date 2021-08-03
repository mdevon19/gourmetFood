import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Order } from './shared/Order';
import { OrderCheck } from './shared/OrderCheck';

@Injectable({
  providedIn: 'root'
})
export class GetOrderDetailsServiceService {

  constructor(private http: HttpClient) { }

  getOrderURL: string = 'http://localhost:8080/GourmetFood/orderCheck';


  getOrderDetails(data: any): Observable<any>{
    return this.http.get<Order>(this.getOrderURL, {
      params: {
        tableNumber: data
      }
    });
  }

}
