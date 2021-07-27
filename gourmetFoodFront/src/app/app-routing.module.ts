import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CheckoutComponent } from './checkout/checkout.component';

import {HomeComponent} from './home/home.component';
import { OrderComponent } from './order/order.component';

const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'order', component: OrderComponent},
  { path: 'checkout', component: CheckoutComponent},
  { path: '', redirectTo: '/home', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
