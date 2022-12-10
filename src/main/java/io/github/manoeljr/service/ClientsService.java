package io.github.manoeljr.service;

import io.github.manoeljr.model.Client;
import io.github.manoeljr.repository.ClientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClientsService {

    @Autowired
    private ClientsRepository clientsRepository;

    public void saveClient(Client client) {
        validClient(client);
        clientsRepository.persist(client);
    }

    public void validClient(Client client) {
        // Aplica algumas validações no cliente
    }

}
