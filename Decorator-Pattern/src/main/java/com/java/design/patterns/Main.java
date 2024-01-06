package com.java.design.patterns;

import com.java.design.patterns.pizza.*;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza1 = new Mushroom(new ExtraCheese(new Margherita()));
        System.out.println(pizza1.cost());
        BasePizza pizza2 = new ExtraCheese(new ExtraCheese(new VegDelight()));
        System.out.println(pizza2.cost());
    }
}