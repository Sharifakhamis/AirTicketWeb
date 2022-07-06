import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ContactComponent } from './componet/contact/contact.component';
import { HomeComponent } from './componet/home/home.component';
import { NavComponent } from './componet/nav/nav.component';
import { RegComponent } from './componet/reg/reg.component';
import { SuccesComponent } from './componet/succes/succes.component';
import { TableComponent } from './componet/table/table.component';
import { TicketbookingComponent } from './componet/ticketbooking/ticketbooking.component';
import { ComponetloginComponent } from './componetlogin/componetlogin.component';

const routes: Routes = [
{path:'',component:ComponetloginComponent},
{path:'reg',component:RegComponent},
{path:'nav',component:NavComponent,children:[
  {path:'home',component:HomeComponent},
  {path:'contact',component:ContactComponent},
  {path:'ticketbooking',component:TicketbookingComponent} ,
  {path:'table',component:TableComponent},
  {path:'success',component:SuccesComponent},
  
]},


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
