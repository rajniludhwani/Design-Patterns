package com.java.design.patterns;

public abstract class LivingThings {
    BreatheImplementor breatheImplementor;
    public LivingThings(BreatheImplementor breatheImplementor) {
        this.breatheImplementor = breatheImplementor;
    }
    abstract void breatheProcess();
}
