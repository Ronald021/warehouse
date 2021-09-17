package com.app.warehouse.services.interfaces;

import com.app.warehouse.model.Product;
import com.app.warehouse.model.Provider;

import java.util.List;

public interface IProvider {
    List<Provider> listProvider();
   /* Provider findById(long id);
    void save(Provider p);
    void deleteById(long id);*/
}
