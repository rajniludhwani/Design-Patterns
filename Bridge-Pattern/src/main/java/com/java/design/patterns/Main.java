package com.java.design.patterns;

public class Main {
    public static void main(String[] args) {
        LivingThings fishObject = new Fish(new WaterBreatheImplementation());
        fishObject.breatheProcess();
    }
}