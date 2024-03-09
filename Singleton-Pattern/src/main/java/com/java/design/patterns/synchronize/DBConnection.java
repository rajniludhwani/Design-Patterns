package com.java.design.patterns.synchronize;

public class DBConnection {

  private static DBConnection conObject;

  private DBConnection() {

  }

  //using synchronize is a costly operation hence, double locking comes into picture
  synchronized public static DBConnection getInstance() {
    System.out.println("Instance of Synchronized Lazy Initialisation");
    if (conObject == null) {
      conObject = new DBConnection();
    }
    return conObject;
  }
}
