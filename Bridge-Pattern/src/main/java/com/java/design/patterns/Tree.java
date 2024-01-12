package com.java.design.patterns;

public class Tree extends LivingThings {
    public Tree(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    void breatheProcess() {
        breatheImplementor.breathe();
    }
}
