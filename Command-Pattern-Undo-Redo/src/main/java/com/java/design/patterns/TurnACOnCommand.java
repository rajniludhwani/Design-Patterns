package com.java.design.patterns;

public class TurnACOnCommand implements Command {
    AirConditioner ac;

    public TurnACOnCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOnAC();
        ac.setTemperature(20);
    }

    @Override
    public void undo() {
        ac.turnOffAC();
    }
}
