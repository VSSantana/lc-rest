package br.com.letscode.rest.controller.dto;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import br.com.letscode.rest.model.Client;

public class ClientDto {

    private String name;
    private Integer age;
    private String vatNumber;
    private String email;

    public ClientDto(Client client) {
        this.name = client.getName();
        this.age = client.getAge();
        this.vatNumber = client.getVatNumber();
        this.email = client.getEmail();
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public String getEmail() {
        return email;
    }

    public static List<ClientDto> convertion(List<Client> clients) {
        return clients.stream().map(ClientDto::new).collect(Collectors.toList());
    }

}
