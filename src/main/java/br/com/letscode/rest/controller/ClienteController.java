package br.com.letscode.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ClienteController {

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "HOME";
    }

    @RequestMapping("/client/list")
    @ResponseBody
    public String getClients() {
        return "CLIENTES";
    }

    @RequestMapping("/client")
    @ResponseBody
    public String insertClient() {
        return "CLIENTES";
    }

    @RequestMapping("/client/{id}")
    @ResponseBody
    public String alterClient() {
        return "CLIENTES";
    }

    // @RequestMapping("/client")
    // @ResponseBody
    // public String deleteClient() {
    // return "CLIENTES";
    // }

}
