package org.example;

import org.example.oberverpattern.interfaces.IObserver;
import org.example.oberverpattern.interfaces.IObserverable;
import org.example.oberverpattern.interfaces.implementationclasses.ObservableImpl;
import org.example.oberverpattern.interfaces.implementationclasses.ObserverImpl;
import org.example.strategypattern.strategy.PaymentProcess;
import org.example.strategypattern.strategy.strategyImpl.CreditCard;

public class Main {
    public static void main(String[] args) {
//        Strategy Pattern
//        PaymentProcess pay = new PaymentProcess(new CreditCard());
//        pay.pay();

//        Observer Pattern
//        ObservableImpl observable = new ObservableImpl();
        IObserverable obj = new ObservableImpl();
        IObserver sub1 = new ObserverImpl(obj);
        IObserver sub2 = new ObserverImpl(obj);
        obj.addData(sub1);
        obj.addData(sub2);
        obj.setData(20);//triggers notifyAll(Observable) -> updateData(Observer) -> getData(Observable)

        obj.removeData(sub1);

        obj.setData(200);




    }
}