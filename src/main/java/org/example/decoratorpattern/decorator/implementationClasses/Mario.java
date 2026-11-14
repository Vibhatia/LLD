package org.example.decoratorpattern.decorator.implementationClasses;

import org.example.decoratorpattern.decorator.ICharacter;

public class Mario implements ICharacter {

    @Override
    public String getAbilities() {
        return "Mario is running";
    }
}
