package br.com.letscode.rest.controller.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.com.letscode.rest.model.Client;
import br.com.letscode.rest.repository.ClientRepository;

public class ClientForm {

    @NotNull
    @Length(min = 5, max = 100)
    private String name;
    @NotNull
    @Min(18)
    private Integer age;
    @NotNull
    private String vatnumber;
    @NotNull
    @Email
    private String email;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setVatnumber(String vatnumber) {
        this.vatnumber = vatnumber;
    }

    public String getVatnumber() {
        return vatnumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public Client convertion() {
        return new Client(name, age, vatnumber, email);
    }

    public Client update(Integer id, ClientRepository clientRepository) {
        Client client = clientRepository.getReferenceById(id);
        client.setName(this.name);
        client.setAge(this.age);
        client.setVatnumber(this.vatnumber);
        client.setEmail(this.email);
        return client;
    }

}
