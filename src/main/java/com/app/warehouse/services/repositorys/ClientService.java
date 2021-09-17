package com.app.warehouse.services.repositorys;

import com.app.warehouse.model.Client;
import com.app.warehouse.services.interfaces.IClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.warehouse.services.interfaces.IClient;
import java.util.List;

@Service
public class ClientService implements IClient {

    @Autowired
    private IClientRepo clientRepo;

    @Override
    public List<Client> listClient() {
        return clientRepo.findAll();
    }

  /*  @Override
    public Client findById(long id) {
        return clientRepo.findById(id);
    }

    @Override
    public void save(Client client) {
        clientRepo.save(client);
    }

    @Override
    public void deleteById(long id) {
        clientRepo.deleteById(id);
    }
*/

}
