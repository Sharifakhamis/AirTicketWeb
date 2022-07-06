import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Table } from 'src/app/Services/Table/table';
import { TableService } from 'src/app/Services/Table/table.service';

@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.css']
})
export class TableComponent implements OnInit {
  table!: Table[]

  constructor(private tableService: TableService,private router:Router) { }

  ngOnInit(): void {
    this.getTable();
  }

  public getTable(){
    this.tableService.getAirTicketList().subscribe(data=>{
      console.log(data);
      this.table=data;
    });
  }
  public deleteAirTicket(id:number){
    return this.tableService.deleteAirTicket(id).subscribe(data=>{
      console.log(data);
      this.getTable();

  });

}
}

