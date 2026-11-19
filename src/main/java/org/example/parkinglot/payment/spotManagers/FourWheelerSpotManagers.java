package org.example.parkinglot.payment.spotManagers;

import org.example.parkinglot.payment.entities.ParkingSpot;
import org.example.parkinglot.payment.startegy.ParkingSpotLookupStrategy;

import java.util.List;

public class FourWheelerSpotManagers extends ParkingSpotManagers{
    public FourWheelerSpotManagers(List<ParkingSpot> spots, ParkingSpotLookupStrategy strategy) {
        super(spots, strategy);
    }
}
