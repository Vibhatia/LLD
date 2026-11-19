package org.example.parkinglot.payment.payment;

public class UPIPayment implements Payment{
    @Override
    public boolean pay(double amount) {
        System.out.println("UPI paid: " + amount);
        return true;
    }
}
