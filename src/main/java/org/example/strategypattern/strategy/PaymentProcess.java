package org.example.strategypattern.strategy;

public class PaymentProcess {
    private IPayment payment;

    public PaymentProcess(IPayment payment) {
        this.payment = payment;
    }

    public void setPayment(IPayment payment) {
        this.payment = payment;
    }

    public void pay() {
        payment.pay();
    }
}
