package com.java.design.patterns.doubleLocking;

public class DBConnection {

  private static DBConnection conObject;

  private DBConnection() {

  }

  public static DBConnection getInstance() {
    System.out.println("Instance of Double Locking Initialisation");
    if (conObject == null) {
      /*
       * this faces 2 issues
       * Instruction Reordering issue
       * L1 chaching issues
       * Hence, using volatile comes into action
       */
      synchronized (DBConnection.class) {
          if (conObject == null) {
              conObject = new DBConnection();
          }
      }
    }
    return conObject;
  }
}
