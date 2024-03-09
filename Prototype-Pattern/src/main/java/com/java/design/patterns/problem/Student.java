package com.java.design.patterns.problem;

public class Student {

  public int age;
  public String name;
  private int rollNumber;

  public Student() {
  }

  public Student(int age, int rollNumber, String name) {
    this.age = age;
    this.rollNumber = rollNumber;
    this.name = name;
  }
}
