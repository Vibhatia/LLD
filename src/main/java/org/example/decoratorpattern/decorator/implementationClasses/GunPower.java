package org.example.decoratorpattern.decorator.implementationClasses;

import org.example.decoratorpattern.decorator.ICharacter;
import org.example.decoratorpattern.decorator.IDecorator;

public class GunPower implements IDecorator {
    public final ICharacter ch;
    public GunPower(ICharacter ch){
        this.ch = ch;
    }
    @Override
    public String getAbilities() {
        return ch.getAbilities() + "with gun power";
    }
}
