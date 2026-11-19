package org.example.parkinglot.payment.spotManagers;

import org.example.parkinglot.payment.entities.ParkingSpot;
import org.example.parkinglot.payment.startegy.ParkingSpotLookupStrategy;

import java.util.List;

public class TwoWheelerSpotManagers extends ParkingSpotManagers {


    public TwoWheelerSpotManagers(List<ParkingSpot> spots, ParkingSpotLookupStrategy strategy) {
        super(spots, strategy);
    }
}
