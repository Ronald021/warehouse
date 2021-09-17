package com.app.warehouse.controller;

import com.app.warehouse.model.Product;
import com.app.warehouse.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/product"})
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping({"/listAll"})
    public List<Product> listProduct(){
        return productService.listP();
    }

    @GetMapping({"/findById"})
    public Product findById(final long id){
        return productService.findById(id);
    }

    @GetMapping({"/deleteById"})
    public List<Product> deletebyId(final long id){
        productService.deleteById(id);
        return listProduct();
    }

    @RequestMapping({"/saveProduct"})
    public List<Product> save(final Product product){
        productService.save(product);
        return listProduct();
    }
}
