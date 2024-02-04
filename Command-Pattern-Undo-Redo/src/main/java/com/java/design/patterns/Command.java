package com.java.design.patterns;

public interface Command {
    void execute();

    //For undoing
    void undo();
}
