package com.java.design.patterns;

import com.java.design.patterns.solution.Student;

public class Main {
    public static void main(String[] args) {
//        //Actual Problem
//        com.java.design.patterns.problem.Student obj = new com.java.design.patterns.problem.Student(20, 76, "Ram");
//        //creating Clone of obj
//        com.java.design.patterns.problem.Student cloneObj = new com.java.design.patterns.problem.Student();
//        cloneObj.name = obj.name;
//        cloneObj.age = obj.age;
//        cloneObj.rollNumber = obj.rollNumber;

        //Solution
        Student obj = new Student(20, 76, "Sita");
        Student cloneObj = (Student) obj.clone();
    }
}