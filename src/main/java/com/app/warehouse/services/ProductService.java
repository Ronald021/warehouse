package com.app.warehouse.services;

import com.app.warehouse.model.Product;
import com.app.warehouse.services.interfaces.IProduct;
import com.app.warehouse.services.repositorys.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProduct {

    @Autowired
    private IProductRepository productRepository;

    @Override
    public List<Product> listP() {
        return productRepository.findAll();
    }


}
