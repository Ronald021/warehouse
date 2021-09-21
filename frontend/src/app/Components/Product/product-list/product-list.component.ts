import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Product } from 'src/app/Model/Product';
import { ListService } from 'src/app/Service/list.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  products!: Observable<Product[]>;

  constructor(private listService:ListService, private router:Router) { }

  ngOnInit(): void {
    this.reloadData();
  }

  reloadData() {
    this.products = this.listService.getProducts();
  }

  createProduct(){
    this.router.navigate(["create-product"]);
  }

}