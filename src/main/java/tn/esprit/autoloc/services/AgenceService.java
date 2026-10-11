package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Agence;
import tn.esprit.autoloc.repositories.AgenceRepository;
import tn.esprit.autoloc.repositories.ReservationRepository;

import java.util.List;

public class AgenceService implements AgenceInterface {
    @Override
    public Agence addAgence(Agence a) {

        return null;
    }

    @Override
    public void deleteAgence(Agence a) {

    }

    @Override
    public Agence modifyAgence(Agence a) {
        return null;
    }

    @Override
    public List<Agence> showAgence() {
        return List.of();
    }
}
