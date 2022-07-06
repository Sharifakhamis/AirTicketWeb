import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { TableService } from 'src/app/Services/Table/table.service';

@Component({
  selector: 'app-ticketbooking',
  templateUrl: './ticketbooking.component.html',
  styleUrls: ['./ticketbooking.component.css']
})
export class TicketbookingComponent implements OnInit {
  CreateAirTicket!: FormGroup
  

  constructor(private tableService: TableService, private router:Router) { }

  
 ngOnInit():void {
    this.CreateAirTicket=new FormGroup({
      fnme:  new FormControl(''),
      email:  new FormControl(''),
      phone :  new FormControl(''),
      address: new  FormControl(''),
      adults:  new FormControl(''),
      children:new FormControl(''),
      or_date: new FormControl(''),

  });

}
public AddtoAirTicket(){
  return this.tableService.createAirTicket(this.CreateAirTicket.value).subscribe(data=>{
    console.log(data)
    this.gotoAirTicketList();
    });
    }

    public gotoAirTicketList(){
      this.router.navigate(["nav/table"]);

}

submit(){
  console.log(this.CreateAirTicket.value)
  this.AddtoAirTicket();
}
}
