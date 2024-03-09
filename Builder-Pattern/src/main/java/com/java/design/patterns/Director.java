package com.java.design.patterns;

public class Director {

  StudentBuilder studentBuilder;

  public Director(StudentBuilder studentBuilder) {
    this.studentBuilder = studentBuilder;
  }

  public Student createStudent() {
    if (studentBuilder instanceof EngineeringStudentBuilder) {
      return createEngineeringStudent();
    } else if (studentBuilder instanceof MBAStudentBuilder) {
      return createMBAStudent();
    }
    return null;
  }

  private Student createMBAStudent() {
    return studentBuilder.setRollNo(1).setAge(22).setName("Raj").setSubjects().build();
  }

  private Student createEngineeringStudent() {
    return studentBuilder.setRollNo(2).setAge(24).setName("Simran").setFatherName("Bauji")
        .setMotherName("Maa").setSubjects().build();
  }
}
