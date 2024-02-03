package com.java.design.patterns;

import com.java.design.patterns.WithoutStrategyPattern.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        implementWithoutStrategy();
        System.out.println("----------------------------");
        implementWithStrategy();

        int[][] array = {
                {3, 1, 2, 2},
                {1, 4, 4, 5},
                {2, 4, 2, 2},
                {2, 4, 2, 2}
        };

        Map<String, Integer> counter = new HashMap<>();

        // First Statement
        for (int[] row : array) {
            counter.put(Arrays.toString(row), counter.getOrDefault(Arrays.toString(row), 0) + 1);
        }

        // Print results after the first statement
        System.out.println("Results after the first statement:");
        counter.forEach((key, value) -> System.out.println(key + ": " + value));

        // Reset counter for the second statement
        counter.clear();

        // Second Statement
        for (int[] row : array) {
            counter.merge(Arrays.toString(row), 1, Integer::sum);
        }

        // Print results after the second statement
        System.out.println("\nResults after the second statement:");
        counter.forEach((key, value) -> System.out.println(key + ": " + value));

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