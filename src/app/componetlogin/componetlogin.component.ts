import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-componetlogin',
  templateUrl: './componetlogin.component.html',
  styleUrls: ['./componetlogin.component.css']
})
export class ComponetloginComponent implements OnInit {

  constructor(private route: Router) { }

  ngOnInit(): void {
  }

  onSubmit(){
    this.route.navigateByUrl("home");
    }

}
