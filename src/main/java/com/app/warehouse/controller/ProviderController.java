package com.app.warehouse.controller;

import com.app.warehouse.model.Product;
import com.app.warehouse.model.Provider;
import com.app.warehouse.services.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping({"/provider"})
public class ProviderController {

    @Autowired
    private ProviderService providerServ;
    @GetMapping
    public List<Provider> listProduct(){
        return providerServ.listProvider();
    }
}
