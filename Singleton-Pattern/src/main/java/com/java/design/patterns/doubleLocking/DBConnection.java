package com.java.design.patterns.doubleLocking;

public class DBConnection {
    private static DBConnection conObject;
    private DBConnection(){

    }

    public static DBConnection getInstance() {
        System.out.println("Instance of Double Locking Initialisation");
        if(conObject == null) {
            synchronized (DBConnection.class) {
                if(conObject == null)
                    conObject = new DBConnection();
            }
        }
        return conObject;
    }
}
