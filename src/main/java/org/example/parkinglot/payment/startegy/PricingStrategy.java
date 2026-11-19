package org.example.parkinglot.payment.startegy;

import org.example.parkinglot.payment.Ticket;

public interface PricingStrategy {
    double calculate(Ticket ticket);
}
