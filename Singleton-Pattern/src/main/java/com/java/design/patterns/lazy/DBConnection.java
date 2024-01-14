package com.java.design.patterns.lazy;

public class DBConnection {
    private static DBConnection conObject;
    private DBConnection(){

    }

    public static DBConnection getInstance() {
        System.out.println("Instance of Lazy Initialisation");
        //if more than one thread access this, will create more than on object in the memory, hence level up is using "synchronized"
        if(conObject == null)
            conObject = new DBConnection();
        return conObject;
    }
}
