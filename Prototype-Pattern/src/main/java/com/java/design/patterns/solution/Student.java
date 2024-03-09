package com.java.design.patterns.solution;

public class Student implements Prototype {

  int age;
  String name;
  private int rollNumber;

  public Student() {
  }

  public Student(int age, int rollNumber, String name) {
    this.age = age;
    this.rollNumber = rollNumber;
    this.name = name;
  }

  @Override
  public Prototype clone() {
    System.out.println("Cloning Student");
    return new Student(age, rollNumber, name);
  }
}
