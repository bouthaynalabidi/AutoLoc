package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Contrat;

public interface ContratInterface {
    public Contrat addContrat(Contrat c);
    public Contrat modifyContrat(Contrat c);
    public void deleteContrat(Contrat c);
    public Contrat showContrat();
}
