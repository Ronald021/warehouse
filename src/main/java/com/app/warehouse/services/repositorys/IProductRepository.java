package com.app.warehouse.services.repositorys;

import com.app.warehouse.model.Product;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface IProductRepository extends Repository<Product, Long> {
    List<Product> findAll();
    //Product findOne(int id);
  /*  Product save(Product p);
    void delete(int id);*/
}
