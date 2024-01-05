package com.java.design.patterns;

import com.java.design.patterns.WithoutStrategyPattern.*;

public class Main {
    public static void main(String[] args) {
        implementWithoutStrategy();
        System.out.println("----------------------------");
        implementWithStrategy();
    }

    private static void implementWithoutStrategy() {
        new GoodsVehicle().drive();
        new PassengerVehicle().drive();
        new OffRoadVehicle().drive();
        new SportsVehicle().drive();
    }

    private static void implementWithStrategy() {
        new com.java.design.patterns.WithStrategyPattern.GoodsVehicle().drive();
        new com.java.design.patterns.WithStrategyPattern.OffRoadVehicle().drive();
        new com.java.design.patterns.WithStrategyPattern.SportsVehicle().drive();
    }
}