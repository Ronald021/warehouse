import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Product } from 'src/app/Model/Product';
import { SaveDataService } from 'src/app/Service/save-data.service';

@Component({
  selector: 'app-create-product',
  templateUrl: './create-product.component.html',
  styleUrls: ['./create-product.component.css']
})
export class CreateProductComponent implements OnInit {

  product = new Product();
  submitted = false;

  constructor(private router: Router, private service: SaveDataService) { }

  ngOnInit(): void {
  }

  newProduct(): void {
    this.submitted = false;
    this.product = new Product();
  }

  save() {
    this.service.createProduct(this.product).subscribe(result => {
      this.product = new Product();
      console.log(result);
      this.gotoList();
    });
  }

  onSubmit() {
    this.submitted = true;
    this.save();
  }

  gotoList() {
    this.router.navigate(["product-list"]);
  }

}
