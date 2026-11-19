package org.example.parkinglot.payment.startegy;

import org.example.parkinglot.payment.Ticket;

public class CostComputation {

    private final PricingStrategy pricingStrategy;

    public CostComputation(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double compute(Ticket ticket) {;

        return pricingStrategy.calculate(ticket);
    }
}
