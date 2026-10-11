package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Agence;

import java.util.List;

public interface AgenceInterface {
    public Agence addAgence(Agence a);
    public void deleteAgence(Agence a);
    public Agence modifyAgence(Agence a);
    public List<Agence> showAgence();
}
