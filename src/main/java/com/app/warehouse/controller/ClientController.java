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

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/client"})
public class ClientController {

    @Autowired
    private ClientService clientService;


  //  @GetMapping({"/listAll"})
  /*  public List<Client> listClients(){
        return clientService.listClient();
    }

    @GetMapping({"/findById"})
    public Client findById(final long id){
        return clientService.findById(id);
    }

    @GetMapping({"/deleteById"})
    public List<Client> deletebyId(final long id){
        clientService.deleteById(id);
        return listClients();
    }

    @GetMapping({"/saveClient"})
    public List<Client> save(final Client client){
        clientService.save(client);
        return listClients();
    }*/
}
