package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Reservation;

public interface ReservationInterface {
    public Reservation addReservation(Reservation r);
    public Reservation modifyReservation(Reservation r);
    public void deleteReservation(Reservation r);
    public void showReservation(Reservation r);
}
