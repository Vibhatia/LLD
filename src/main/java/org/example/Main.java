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
import org.example.strategypattern.strategy.PaymentProcess;
import org.example.strategypattern.strategy.strategyImpl.CreditCard;

import java.sql.SQLOutput;

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

        ICharacter ch = new Mario();
        ICharacter id = new HeightUp(new GunPower(new Mario()));//heightup is the outermost decorator
        System.out.println(id.getAbilities());



    }
}