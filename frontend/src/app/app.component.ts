import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'inventory-app';

  constructor(private router:Router){}

  ListProduct(){
    this.router.navigate(["product-list"]);
  }
}
