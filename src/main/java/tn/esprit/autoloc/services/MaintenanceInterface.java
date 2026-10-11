package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Maintenance;

public interface MaintenanceInterface {
    public Maintenance addMaintenance(Maintenance m);
    public void deleteMaintenance(Maintenance m);
    public Maintenance modifyMaintenance(Maintenance m);
    public void showMaintenance(Maintenance m);
}
