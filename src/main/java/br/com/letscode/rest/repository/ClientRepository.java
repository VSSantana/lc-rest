package br.com.letscode.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.letscode.rest.model.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
