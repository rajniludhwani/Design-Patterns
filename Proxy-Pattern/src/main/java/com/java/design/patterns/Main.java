package com.java.design.patterns;

public class Main {

  public static void main(String[] args) {
    try {
      EmployeeDao empTableObj = new EmployeeDaoProxy();
      empTableObj.create("ADMIN", new EmployeeDo());
      System.out.println("Operation Successful");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}