package org.example.decoratorpattern.decorator.implementationClasses;

import org.example.decoratorpattern.decorator.ICharacter;
import org.example.decoratorpattern.decorator.IDecorator;

public class HeightUp implements IDecorator {
    ICharacter ch;
    public HeightUp(ICharacter ch){
        this.ch = ch;
    }
    @Override
    public String getAbilities() {
        return ch.getAbilities() + "with Height Up";
    }
}
