package org.example.parkinglot.payment.startegy;

import org.example.parkinglot.payment.entities.ParkingSpot;

import java.util.List;

public interface ParkingSpotLookupStrategy {
    ParkingSpot selectSpot(List<ParkingSpot> spots);
}
