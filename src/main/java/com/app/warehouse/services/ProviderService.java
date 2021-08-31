package com.app.warehouse.services;

import com.app.warehouse.model.Provider;
import com.app.warehouse.services.interfaces.IProvider;
import com.app.warehouse.services.repositorys.IProductRepository;
import com.app.warehouse.services.repositorys.IProviderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderService implements IProvider {

    @Autowired
    private IProviderRepo providerRepo;

    @Override
    public List<Provider> listProvider() {
        return providerRepo.findAll();
    }
}
