package com.java.design.patterns.WithStrategyPattern;

import com.java.design.patterns.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {

  public OffRoadVehicle() {
    super(new SportsDriveStrategy());
  }
}
