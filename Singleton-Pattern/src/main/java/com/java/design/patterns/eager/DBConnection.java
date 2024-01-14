package com.java.design.patterns.eager;

public class DBConnection {
    private static DBConnection conObject = new DBConnection();
    private DBConnection(){

    }

    public static DBConnection getInstance() {
        System.out.println("Instance of Eager Initialisation");
        return conObject;
    }
}
