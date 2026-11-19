package org.example.parkinglot.payment.startegy;

import org.example.parkinglot.payment.Ticket;

public class FixedPriceStrategy implements PricingStrategy{
    @Override
    public double calculate(Ticket ticket) {
        return 100;
    }
}
