package com.example.demo.service;



import ch.qos.logback.core.net.server.Client;
import com.example.demo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository;

    @Override
    public void saveClient(Client client) {
        clientRepository.saveClient(client);
    }

    @Override
    public Client getUser(int id) {
        return clientRepository.getClient(id);
    }

}
