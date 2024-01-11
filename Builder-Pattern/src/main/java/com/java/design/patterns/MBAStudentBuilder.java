package com.java.design.patterns;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder {
    @Override
    StudentBuilder setSubjects() {
        List<String> subs = new ArrayList<>(List.of("Micro Economics", "BusinessStudies", "Accountancy"));
        this.subjects = subs;
        return this;
    }
}
