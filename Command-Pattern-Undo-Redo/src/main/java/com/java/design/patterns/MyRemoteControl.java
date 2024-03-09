package com.java.design.patterns;

import java.util.Stack;

public class MyRemoteControl {

  Stack<Command> acCommandHistory = new Stack<>();
  Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  public void pressButton() {
    command.execute();
    //For storing commands executed till moment
    acCommandHistory.add(command);
  }

  public void undo() {
    while (!acCommandHistory.isEmpty()) {
      Command lastCommand = acCommandHistory.pop();
      lastCommand.undo();
    }
  }
}
