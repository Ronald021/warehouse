package com.app.warehouse.services.repositorys;

import com.app.warehouse.model.Product;
import com.app.warehouse.model.Provider;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface IProviderRepo extends Repository<Provider, Integer> {
    List<Provider> findAll();
}
