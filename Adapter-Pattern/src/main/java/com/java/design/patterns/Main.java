package com.java.design.patterns;

import com.java.design.patterns.Adaptee.WeightMachineForBabies;
import com.java.design.patterns.Adapter.WeightMachineAdapter;
import com.java.design.patterns.Adapter.WeightMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}