import { Injectable, EventEmitter, Output } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class BooleanServiceService {

  constructor() { }

  @Output() change: EventEmitter<any> = new EventEmitter();

  sendData(data: any): any {
    this.change.emit(data);
  }
}
