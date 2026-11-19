package org.example.parkinglot.payment.parkinglots;

import org.example.parkinglot.payment.entities.ParkingSpot;
import org.example.parkinglot.payment.enums.VehicleType;
import org.example.parkinglot.payment.spotManagers.ParkingSpotManagers;

import java.util.Map;

public class ParkingLevel {
    private final int levelNumber;
    private final Map<VehicleType, ParkingSpotManagers> managers;


    public ParkingLevel(int levelNumber,Map<VehicleType, ParkingSpotManagers> managers) {
        this.levelNumber = levelNumber;
        this.managers = managers;
    }

    public boolean hasAvailability(VehicleType type) {
        ParkingSpotManagers manager = managers.get(type);
        return manager != null && manager.hasFreeSpot();
    }

    public ParkingSpot park(VehicleType type) {
        ParkingSpotManagers manager = managers.get(type);
        if (manager == null) {
            throw new IllegalArgumentException(
                    "No parking manager for vehicle type: " + type);
        }
        return manager.park();
    }

    public void unPark(VehicleType type, ParkingSpot spot) {
        ParkingSpotManagers manager = managers.get(type);
        if (manager != null) {
            manager.unPark(spot);
        }
    }

    public int getLevelNumber() {
        return levelNumber;
    }
}
