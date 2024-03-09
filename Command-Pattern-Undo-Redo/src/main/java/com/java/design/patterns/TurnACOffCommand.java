package com.java.design.patterns;

public class TurnACOffCommand implements Command {

  AirConditioner ac;

  public TurnACOffCommand(AirConditioner ac) {
    this.ac = ac;
  }

  @Override
  public void execute() {
    ac.turnOffAC();
  }

  @Override
  public void undo() {
    ac.turnOnAC();
  }

}
