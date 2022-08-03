package br.com.letscode.rest.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.letscode.rest.controller.dto.ClientDto;
import br.com.letscode.rest.model.Client;

@RestController
public class ClienteController {

    @RequestMapping("/")
    public String home() {
        return "HOMe";
    }

    @RequestMapping("/client/list")
    public List<ClientDto> getClients() {
        Client client = Client.builder()
                .name("Test of All")
                .age(18)
                .email("test@test.com.test")
                .build();

        return ClientDto.convertion(Arrays.asList(client, client, client));
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
