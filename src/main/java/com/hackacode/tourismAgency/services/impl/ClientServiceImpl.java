package com.hackacode.tourismAgency.services.impl;

import com.hackacode.tourismAgency.entities.Client;
import com.hackacode.tourismAgency.repositories.ClientRepository;
import com.hackacode.tourismAgency.services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepo;

    @Override
    public Client save(Client client) {
        return clientRepo.save(client);
    }

    @Override
    public List<Client> readAll() {
        return clientRepo.findAll();
    }

    @Override
    public Client readById(Long id) {
        return clientRepo.findById(id).orElse(null);
    }

    @Override
    public Client update(Client client) {
        return clientRepo.save(client);
    }

    @Override
    public void delete(Long id) {
        clientRepo.deleteById(id);
    }
}
