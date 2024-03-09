package com.java.design.patterns.WithStrategyPattern;

import com.java.design.patterns.WithStrategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {

  public GoodsVehicle() {
    super(new NormalDriveStrategy());
  }
}
