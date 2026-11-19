package org.example.parkinglot.payment.payment;

public class CashPayment implements Payment{
    @Override
    public boolean pay(double amount) {
        System.out.println("Cash paid: " + amount);
        return true;
    }
}
