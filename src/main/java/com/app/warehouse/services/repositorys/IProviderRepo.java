package com.app.warehouse.services.repositorys;

import com.app.warehouse.model.Client;
import com.app.warehouse.model.Product;
import com.app.warehouse.model.Provider;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface IProviderRepo extends Repository<Provider, Integer> {
    List<Provider> findAll();
   /* Provider findById(long id);
    void save(Provider p);
    void deleteById(long id);*/
}
