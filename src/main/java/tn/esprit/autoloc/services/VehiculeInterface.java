package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Vehicule;

public interface VehiculeInterface {
    public Vehicule addVehicule(Vehicule v);
    public Vehicule modifyVehicule(Vehicule v);
    public void deleteVehicule(Vehicule v);
    public void showVehicule(Vehicule v);
}
