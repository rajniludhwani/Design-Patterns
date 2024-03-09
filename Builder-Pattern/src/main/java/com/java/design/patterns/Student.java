package com.java.design.patterns;

import java.util.List;

public class Student {

  int rollNo;
  int age;
  String name;
  String fatherName;
  String motherName;
  List<String> subjects;

  public Student(StudentBuilder studentBuilder) {
    this.rollNo = studentBuilder.rollNo;
    this.age = studentBuilder.age;
    this.name = studentBuilder.name;
    this.fatherName = studentBuilder.fatherName;
    this.motherName = studentBuilder.motherName;
    this.subjects = studentBuilder.subjects;
  }

  @Override
  public String toString() {
    return "Student{" +
        "rollNo=" + rollNo +
        ", age=" + age +
        ", name='" + name + '\'' +
        ", fatherName='" + fatherName + '\'' +
        ", motherName='" + motherName + '\'' +
        ", subjects=" + subjects +
        '}';
  }
}
