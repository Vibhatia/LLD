package org.example.parkinglot.payment.parkinglots;

import org.example.parkinglot.payment.Ticket;
import org.example.parkinglot.payment.entities.ParkingSpot;
import org.example.parkinglot.payment.entities.Vehicle;
import org.example.parkinglot.payment.startegy.CostComputation;

import java.util.List;

public class ParkingBuilding {
    private final List<ParkingLevel> levels;

    public ParkingBuilding(List<ParkingLevel> levels,
                           CostComputation costComputation) {
        this.levels = levels;
    }

    Ticket allocate(Vehicle vehicle) {
        for (ParkingLevel level : levels) {
            if (level.hasAvailability(vehicle.getVehicleType())) {
                ParkingSpot spot = level.park(vehicle.getVehicleType());
                if (spot != null) {
                    Ticket ticket = new Ticket(vehicle, level, spot);
                    System.out.println("Parking allocated at level: "
                            + level.getLevelNumber()
                            + " spot: " + spot.getSpotId());
                    return ticket;
                }
            }
        }
        throw new RuntimeException("Parking Full");
    }

    void release(Ticket ticket) {
        ticket.getLevel().unPark(
                ticket.getVehicle().getVehicleType(),
                ticket.getSpot()
        );
    }
}
