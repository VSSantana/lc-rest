package br.com.letscode.rest.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.letscode.rest.controller.dto.ClientDto;
import br.com.letscode.rest.controller.form.ClientForm;
import br.com.letscode.rest.model.Client;
import br.com.letscode.rest.repository.ClientRepository;

@RestController
@RequestMapping("/client")
public class ClienteController {

    @Autowired
    private ClientRepository clientRepository;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<ClientDto> getClients() {
        List<Client> clients = clientRepository.findAll();
        return ClientDto.convertion(clients);
    }

    // @RequestMapping("/{id}")
    // @GetMapping
    // public ClientDto getClient(Integer id) {
    // Client client = clientRepository.findById(id);
    // return ClientDto.convertion(clients);
    // }

    @PostMapping
    public ResponseEntity<ClientDto> insertClient(@RequestBody @Valid ClientForm client,
            UriComponentsBuilder uriBuilder) {
        Client newClient = client.convertion();
        clientRepository.save(newClient);
        URI uri = uriBuilder.path("/clients/{id}").buildAndExpand(newClient.getId()).toUri();
        return ResponseEntity.created(uri).body(new ClientDto(newClient));
    }

    @RequestMapping("/{id}")
    @PutMapping
    public String alterClient() {
        return "CLIENTES";
    }

    // @RequestMapping("/client")
    // @ResponseBody
    // public String deleteClient() {
    // return "CLIENTES";
    // }

}
