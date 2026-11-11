package org.example.oberverpattern.interfaces;

public interface IObserverable {
    void addData(IObserver observer);
    void removeData(IObserver observer);
    void notifySubscribers();
    void setData(int data);
    int getData();
}
