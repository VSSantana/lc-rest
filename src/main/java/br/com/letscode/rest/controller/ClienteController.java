package br.com.letscode.rest.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.letscode.rest.controller.dto.ClientDto;
import br.com.letscode.rest.model.Client;
import br.com.letscode.rest.repository.ClientRepository;

@RestController
public class ClienteController {

    @Autowired
    private ClientRepository clientRepository;

    @RequestMapping("/")
    public String home() {
        return "HOMe";
    }

    @RequestMapping("/client/list")
    public List<ClientDto> getClients() {
        List<Client> clients = clientRepository.findAll();
        return ClientDto.convertion(clients);
    }

    @RequestMapping("/client")
    public String insertClient() {
        return "CLIENTES";
    }

    @RequestMapping("/client/{id}")
    public String alterClient() {
        return "CLIENTES";
    }

    // @RequestMapping("/client")
    // @ResponseBody
    // public String deleteClient() {
    // return "CLIENTES";
    // }

}
