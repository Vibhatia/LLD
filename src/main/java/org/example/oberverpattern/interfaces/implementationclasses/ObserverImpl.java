package org.example.oberverpattern.interfaces.implementationclasses;

import org.example.oberverpattern.interfaces.IObserver;
import org.example.oberverpattern.interfaces.IObserverable;

public class ObserverImpl implements IObserver {
    private final IObserverable subject;

    public ObserverImpl(IObserverable subject) {
        this.subject = subject;
    }

    @Override
    public void updateData() {
        System.out.println("Observer notified. New data: " + subject.getData());
    }
}

