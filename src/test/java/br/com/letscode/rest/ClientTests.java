package br.com.letscode.rest;

import br.com.letscode.rest.model.Client;

public class ClientTests {

    public static void main(String[] args) {

        Client client = Client.builder()
                .name("Test of All")
                .age(18)
                .email("test@test.com.test")
                .build();

        System.out.println("Name: " + client.getName());
        System.out.println("Age: " + client.getAge());
        System.out.println("Email: " + client.getEmail());

    }

}
