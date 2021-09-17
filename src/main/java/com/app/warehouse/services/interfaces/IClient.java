package com.app.warehouse.services.interfaces;

import com.app.warehouse.model.Client;
import com.app.warehouse.model.Product;

import java.util.List;

public interface IClient {
    List<Client> listClient();
  /*  Client findById(long id);
    void save(Client p);
    void deleteById(long id);*/
}
