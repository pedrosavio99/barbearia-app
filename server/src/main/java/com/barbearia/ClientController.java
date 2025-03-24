package com.barbearia.controller;

import com.barbearia.model.Client;
import com.barbearia.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    // Endpoint para listar todos os clientes
    @GetMapping
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    // Endpoint para cadastrar um cliente
    @PostMapping
    public Client createClient(@RequestBody Client client) {
        return clientRepository.save(client);
    }
}