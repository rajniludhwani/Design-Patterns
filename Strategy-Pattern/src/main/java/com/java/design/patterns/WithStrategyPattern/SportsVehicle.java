package com.java.design.patterns.WithStrategyPattern;

import com.java.design.patterns.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

  public SportsVehicle() {
    super(new SportsDriveStrategy());
  }
}
