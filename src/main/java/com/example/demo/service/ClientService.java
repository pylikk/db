package com.example.demo.service;


import ch.qos.logback.core.net.server.Client;

public interface ClientService {
    void saveClient(Client client);
    Client getClient(int id);
}
