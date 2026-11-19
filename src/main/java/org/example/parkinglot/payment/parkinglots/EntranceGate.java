package org.example.parkinglot.payment.parkinglots;

import org.example.parkinglot.payment.Ticket;
import org.example.parkinglot.payment.entities.Vehicle;

public class EntranceGate {
    public Ticket enter(ParkingBuilding building, Vehicle vehicle) {
        return building.allocate(vehicle);
    }
}
