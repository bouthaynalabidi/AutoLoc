package tn.esprit.autoloc.services;


import tn.esprit.autoloc.entities.Agence;
import tn.esprit.autoloc.entities.Client;

import java.util.List;

public interface ClientInterface {


        public Client addClient(Client c);
        public void deleteClient(Client c);
        Agence modifyClient(Client c);
        public List<Client> showClients();
    }

