package heinle.leonardo.exemplolombok.controllers;

import heinle.leonardo.exemplolombok.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ClientController {

    @GetMapping("/clients")
    public ArrayList<Client> getClients() {

        ArrayList<Client> clients = new ArrayList<>();

        Client client = new Client();
        client.setName("Leo");
        client.setLastName("Heinle");
        client.setAge(20);

        Client client1 = new Client();
        client1.setName("Joao");
        client1.setLastName("Silva");
        client1.setAge(21);

        clients.add(client);
        clients.add(client1);

        return clients;
    }
}
