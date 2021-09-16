package com.app.warehouse.controller;

import com.app.warehouse.model.Client;
import com.app.warehouse.model.Product;
import com.app.warehouse.services.ProductService;
import com.app.warehouse.services.repositorys.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping({"/client"})
public class ClientController {

    @Autowired
    private ClientService clientService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public List<Client> listClients(){
        return clientService.listClient();
    }
}
