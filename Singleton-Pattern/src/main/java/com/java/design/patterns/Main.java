package com.java.design.patterns;


public class Main {
    public static void main(String[] args) {
        /*
        * 4 ways to achieve this:
        * 1. Eager
        * 2. Lazy
        * 3. Synchronized
        * 4. Double Locking
        */
        com.java.design.patterns.eager.DBConnection eagerConObj =
                com.java.design.patterns.eager.DBConnection.getInstance();
        System.out.println("-----------------");
        com.java.design.patterns.lazy.DBConnection lazyConObj =
                com.java.design.patterns.lazy.DBConnection.getInstance();
        System.out.println("-----------------");
        com.java.design.patterns.synchronize.DBConnection synchronizedConObj =
                com.java.design.patterns.synchronize.DBConnection.getInstance();
        System.out.println("-----------------");
        com.java.design.patterns.doubleLocking.DBConnection doubleLockingConObj =
                com.java.design.patterns.doubleLocking.DBConnection.getInstance();
        System.out.println("-----------------");
    }
}