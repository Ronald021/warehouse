import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import {Observable} from "rxjs/index";

@Injectable({
  providedIn: 'root'
})
export class SaveDataService {

  baseUrl = 'http://localhost:8080';
  saveProduct = '/product/saveProduct';

  constructor(private http:HttpClient) { }

  createProduct(product: Object): Observable<Object>{
    return this.http.post(`${this.baseUrl+this.saveProduct}`, product);
  }
  
}
