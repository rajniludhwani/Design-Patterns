package com.java.design.patterns;

public class Dog extends LivingThings {
    public Dog(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    void breatheProcess() {
        breatheImplementor.breathe();
    }
}
