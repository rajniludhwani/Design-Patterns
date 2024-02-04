package com.java.design.patterns;

public class PayToMerchantFlow extends PaymentFlow {
    @Override
    public void validateRequest() {
        System.out.println("Validate Logic of PayToMerchant");
    }

    @Override
    public void calculateFees() {
        System.out.println("2% fees charged");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit the Amount Logic of PayToMerchant");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit the Remaining Amount");
    }
}
