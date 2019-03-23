package com.example.demo.repository;


import com.example.demo.model.Client;

import javax.transaction.Transactional;

public interface ClientRepository {
    @Transactional
    void saveClient(Client client);

    void saveUser(Client client);
    Client getClient(int id);
}
