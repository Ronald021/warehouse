package com.app.warehouse.services.repositorys;

import com.app.warehouse.model.Product;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface IProductRepository extends Repository<Product, Long> {
    List<Product> findAll();
    Product findById(long id);
    void save(Product p);
    void deleteById(long id);
}
