package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Agence;
import tn.esprit.autoloc.entities.Client;

import java.util.List;

public class ClientService implements ClientInterface {


    @Override
    public Client addClient(Client c) {
        return null;
    }

    @Override
    public void deleteClient(Client c) {

    }

    @Override
    public Agence modifyClient(Client c) {
        return null;
    }

    @Override
    public List<Client> showClients() {
        return List.of();
    }
}
