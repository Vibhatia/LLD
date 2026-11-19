package org.example;

import org.example.decoratorpattern.decorator.ICharacter;
import org.example.decoratorpattern.decorator.IDecorator;
import org.example.decoratorpattern.decorator.implementationClasses.GunPower;
import org.example.decoratorpattern.decorator.implementationClasses.HeightUp;
import org.example.decoratorpattern.decorator.implementationClasses.Mario;
import org.example.oberverpattern.interfaces.IObserver;
import org.example.oberverpattern.interfaces.IObserverable;
import org.example.oberverpattern.interfaces.implementationclasses.ObservableImpl;
import org.example.oberverpattern.interfaces.implementationclasses.ObserverImpl;
import org.example.parkinglot.payment.Ticket;
import org.example.parkinglot.payment.entities.ParkingSpot;
import org.example.parkinglot.payment.entities.Vehicle;
import org.example.parkinglot.payment.enums.VehicleType;
import org.example.parkinglot.payment.parkinglots.*;
import org.example.parkinglot.payment.payment.CashPayment;
import org.example.parkinglot.payment.payment.UPIPayment;
import org.example.parkinglot.payment.spotManagers.FourWheelerSpotManagers;
import org.example.parkinglot.payment.spotManagers.ParkingSpotManagers;
import org.example.parkinglot.payment.spotManagers.TwoWheelerSpotManagers;
import org.example.parkinglot.payment.startegy.CostComputation;
import org.example.parkinglot.payment.startegy.FixedPriceStrategy;
import org.example.parkinglot.payment.startegy.ParkingSpotLookupStrategy;
import org.example.parkinglot.payment.startegy.RandomLookup;
import org.example.strategypattern.strategy.PaymentProcess;
import org.example.strategypattern.strategy.strategyImpl.CreditCard;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        Strategy Pattern
//        PaymentProcess pay = new PaymentProcess(new CreditCard());
//        pay.pay();

//        Observer Pattern
//        ObservableImpl observable = new ObservableImpl();
//        IObserverable obj = new ObservableImpl();
//        IObserver sub1 = new ObserverImpl(obj);
//        IObserver sub2 = new ObserverImpl(obj);
//        obj.addData(sub1);
//        obj.addData(sub2);
//        obj.setData(20);//triggers notifyAll(Observable) -> updateData(Observer) -> getData(Observable)
//
//        obj.removeData(sub1);
//
//        obj.setData(200);

//        ICharacter ch = new Mario();
//        ICharacter id = new HeightUp(new GunPower(new Mario()));//heightup is the outermost decorator
//        System.out.println(id.getAbilities());




        //Parking lot
        ParkingSpotLookupStrategy strategy = new RandomLookup();

        Map<VehicleType, ParkingSpotManagers> levelOneManagerss = new HashMap<>();
        levelOneManagerss.put(VehicleType.TWO_WHEEELER,
                new TwoWheelerSpotManagers(List.of(new ParkingSpot("L1-S1"),
                        new ParkingSpot("L1-S2")), strategy));


        ParkingLevel level1 = new ParkingLevel(
                1, levelOneManagerss
        );
//
//        Map<VehicleType, ParkingSpotManagers> levelTwoManagerss = new HashMap<>();
//        levelTwoManagerss.put(VehicleType.TWO_WHEEELER,
//                new TwoWheelerSpotManagers(List.of(new ParkingSpot("L2-S1")), strategy));
//
//        levelTwoManagerss.put(VehicleType.FOUR_WHEELER,
//                new FourWheelerSpotManagers(List.of(new ParkingSpot("L2-S2"),
//                        new ParkingSpot("L2-S3")), strategy));
//
//
//        ParkingLevel level2 = new ParkingLevel(
//                2, levelTwoManagerss
//        );

        ParkingBuilding parkingBuilding =
                new ParkingBuilding(
                        List.of(level1),
//                                level2),
                        new CostComputation(new FixedPriceStrategy())
                );

        ParkingLot parkingLot = new ParkingLot(
                parkingBuilding,
                new EntranceGate(),
                new ExitGate(new CostComputation(new FixedPriceStrategy()))
        );


        Vehicle bike = new Vehicle("BIKE-101", VehicleType.TWO_WHEEELER);
//        Vehicle car = new Vehicle("CAR-201", VehicleType.FOUR_WHEELER);

        Ticket t1 = parkingLot.vehicleArrives(bike);
//        Ticket t2 = parkingLot.vehicleArrives(car);

        parkingLot.vehicleExits(t1, new CashPayment());
//        parkingLot.vehicleExits(t2, new UPIPayment());


    }
}