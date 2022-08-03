package br.com.letscode.rest.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Client {

    private String name;
    private Integer age;
    private String vatNumber;
    private String email;

}
