package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Paiement;

public interface PaiementInterface {
    public Paiement addPaiement(Paiement p);
    public void deletePaiement(Paiement p);
    public Paiement modifyPaiement(Paiement p);
    public void showPaiement(Paiement p);
}
