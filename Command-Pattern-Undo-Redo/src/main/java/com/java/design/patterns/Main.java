package com.java.design.patterns;

public class Main {

  public static void main(String[] args) {
    AirConditioner ac = new AirConditioner();
    MyRemoteControl remoteObj = new MyRemoteControl();

    remoteObj.setCommand(new TurnACOnCommand(ac));
    remoteObj.pressButton();

    remoteObj.setCommand(new TurnACOffCommand(ac));
    remoteObj.pressButton();

    //undo last operation
    remoteObj.undo();
  }
}