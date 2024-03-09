package com.java.design.patterns.volatileSolution;

public class DBConnection {

  /*
   * volatile reads/writes directly from memory hence resolving caching issue
   * reordering - before volatile can be reordered, after volatile can be reordered. But not mixed.
   */
  private static volatile DBConnection conObject;
  int memberVariable;

  private DBConnection() {

  }

  public static DBConnection getInstance() {
    System.out.println("Instance of volatile Initialisation");
    if (conObject == null) {
      synchronized (DBConnection.class) {
        if (conObject == null) {
          conObject = new DBConnection();
        }
      }
    }
    return conObject;
  }
}
