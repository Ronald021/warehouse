package com.app.warehouse.services.repositorys;

import com.app.warehouse.model.Client;
import com.app.warehouse.model.Product;
import com.app.warehouse.model.Provider;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface IClientRepo extends Repository<Client, Integer> {
    List<Client> findAll();
   /* Client findById(long id);
    void save(Client p);
    void deleteById(long id);*/

}
