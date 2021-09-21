package com.app.warehouse.services.interfaces;

import com.app.warehouse.model.Product;

import java.util.List;

public interface IProduct {
     List<Product> listP();
     Product findById(long id);
     Product save(Product product);
     void deleteById(long id);
     Product update(Product product);

}
