import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Order } from './shared/Order';

@Injectable({
  providedIn: 'root'
})
export class WaiterServiceService {


  constructor(private http: HttpClient) { }

  getOrdersURL: string = 'http://localhost:8080/GourmetFood/allOrders';
  deleteOrderURL: string = 'http://localhost:8080/GourmetFood/clearTable';

  getAllOrders(){
    return this.http.get<Order []>(this.getOrdersURL);
  }

  deleteOrder(data: any): Observable<String> {
    return this.http.delete<String>(this.deleteOrderURL, {
      params: {
        tableNumber: data
      }
    });
  }

}
