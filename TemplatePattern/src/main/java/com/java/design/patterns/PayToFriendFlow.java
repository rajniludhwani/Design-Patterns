package com.java.design.patterns;

public class PayToFriendFlow extends PaymentFlow {

  @Override
  public void validateRequest() {
    System.out.println("Validate Logic of PayToFriend");
  }

  @Override
  public void calculateFees() {
    System.out.println("0% fees charged");
  }

  @Override
  public void debitAmount() {
    System.out.println("Debit the Amount Logic of PayToFriend");
  }

  @Override
  public void creditAmount() {
    System.out.println("Credit the full Amount");
  }
}
