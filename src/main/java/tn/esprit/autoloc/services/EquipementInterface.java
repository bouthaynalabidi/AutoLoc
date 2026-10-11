package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Equipement;

public interface EquipementInterface {
    public Equipement addEquipe(Equipement e);
    public void deleteEquipe(Equipement e);
    public Equipement modifyEquipe(Equipement e);
    public void showEquipe(Equipement e);
}
