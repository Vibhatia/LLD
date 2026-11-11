package org.example.strategypattern.strategy.strategyImpl;

import org.example.strategypattern.strategy.IPayment;

public class UPIPayment implements IPayment {
    @Override
    public void pay(){
        System.out.println("UPI Payment");
    }
}
