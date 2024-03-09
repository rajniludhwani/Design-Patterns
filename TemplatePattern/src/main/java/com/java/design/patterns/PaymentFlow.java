package com.java.design.patterns;

public abstract class PaymentFlow {

  public abstract void validateRequest();

  public abstract void calculateFees();

  public abstract void debitAmount();

  public abstract void creditAmount();

  //Making it final and ensuring that none of the children can modify it
  public final void sendMoney() {
    validateRequest();
    debitAmount();
    calculateFees();
    creditAmount();
  }

}
