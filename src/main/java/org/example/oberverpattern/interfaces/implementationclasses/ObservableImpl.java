package org.example.oberverpattern.interfaces.implementationclasses;


import org.example.oberverpattern.interfaces.IObserver;
import org.example.oberverpattern.interfaces.IObserverable;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements IObserverable {
    private int data;
    private final List<IObserver> observers = new ArrayList<>();


    @Override
    public void addData(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeData(IObserver observer) {
        observers.remove(observer);
    }


    @Override
    public void notifySubscribers() {
        for (IObserver observer : observers) {
            observer.updateData();
        }
    }

    @Override
    public void setData(int data) {
        this.data = data;
        notifySubscribers();
    }

    @Override
    public int getData() {
        return data;
    }
}
