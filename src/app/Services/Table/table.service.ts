import { Injectable } from '@angular/core';
import{HttpClient}from'@angular/common/http';
import { Observable } from 'rxjs';
import { Table } from './table';

@Injectable({
  providedIn: 'root'
})
export class TableService {
  private baseURL ="http://localhost:8080/api/AirTicket/";

  constructor(private httpClient:HttpClient) { }

  getAirTicketList(): Observable<Table[]>{
    return this.httpClient.get<Table[]>(`${this.baseURL}`);
  }
  
  createAirTicket(table:Table): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`,  table);
  }
  
  deleteAirTicket(id: number): Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}${id}`);
  }
}

  

