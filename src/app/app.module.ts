import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ComponetloginComponent } from './componetlogin/componetlogin.component';
import { RegComponent } from './componet/reg/reg.component';

import { NavComponent } from './componet/nav/nav.component';
import { HomeComponent } from './componet/home/home.component';
import { ContactComponent } from './componet/contact/contact.component';

import { TicketbookingComponent } from './componet/ticketbooking/ticketbooking.component';
import { SuccesComponent } from './componet/succes/succes.component';
import { IndexComponent } from './index/index.component';
import { TableComponent } from './componet/table/table.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    ContactComponent,
    HomeComponent,
    NavComponent,
    RegComponent,
    SuccesComponent,
    TicketbookingComponent,
    ComponetloginComponent,
    IndexComponent,
    TableComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
