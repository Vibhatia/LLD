package org.example.strategypattern.strategy.strategyImpl;

import org.example.strategypattern.strategy.IPayment;

public class CreditCard implements IPayment {
    @Override
    public void pay(){
        System.out.println("Credit Card Implementation");
    }
}
