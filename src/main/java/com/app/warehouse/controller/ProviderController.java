package com.app.warehouse.controller;

import com.app.warehouse.model.Product;
import com.app.warehouse.model.Provider;
import com.app.warehouse.services.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/provider"})
public class ProviderController {

    @Autowired
    private ProviderService providerServ;
/*

    @GetMapping({"/listAll"})
    public List<Provider> listProvider(){
        return providerServ.listProvider();
    }

    @GetMapping({"/findById"})
    public Provider findById(final long id){
        return providerServ.findById(id);
    }

    @GetMapping({"/deleteById"})
    public List<Provider> deletebyId(final long id){
        providerServ.deleteById(id);
        return listProvider();
    }

    @GetMapping({"/saveProvider"})
    public List<Provider> save(final Provider provider){
        providerServ.save(provider);
        return listProvider();
    }*/
}
