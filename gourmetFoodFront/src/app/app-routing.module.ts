import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CheckoutComponent } from './checkout/checkout.component';

import {HomeComponent} from './home/home.component';
import { OrderComponent } from './order/order.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { WaiterComponentComponent } from './waiter-component/waiter-component.component';

const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'order', component: OrderComponent},
  { path: 'checkout', component: CheckoutComponent},
  { path: 'waiter', component: WaiterComponentComponent},
  { path: '', redirectTo: '/home', pathMatch: 'full' },
  { path: '**', component: PageNotFoundComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
