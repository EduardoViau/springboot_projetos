package viau.lombokexemple.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import viau.lombokexemple.model.Client;

import java.util.ArrayList;

@RestController
public class ClientController {
    @GetMapping("/clients")
    public ArrayList<Client> getClient() {

        ArrayList<Client> clients = new ArrayList<>();

        Client client = new Client();
        client.setName("Dudis");
        client.setLasName("Viau");
        client.setAge(18);

        Client client1 = new Client();
        client1.setName("gui");
        client1.setLasName("Porto");
        client1.setAge(21);

        clients.add(client);
        clients.add(client1);

        return clients;

    }
}

