package com.java.design.patterns;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder {
    @Override
    StudentBuilder setSubjects() {
        List<String> subs = new ArrayList<>(List.of("DSA", "OS", "Networking"));
        this.subjects = subs;
        return this;
    }
}
