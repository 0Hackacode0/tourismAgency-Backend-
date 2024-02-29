package com.hackacode.tourismAgency.services;

import com.hackacode.tourismAgency.entities.Client;

import java.util.List;

public interface ClientService {

    Client save(Client client);
    List<Client> readAll();
    Client readById(Long id);
    Client update(Client client);
    void delete(Long id);
}
