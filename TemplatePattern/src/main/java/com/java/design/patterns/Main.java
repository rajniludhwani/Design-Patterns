package com.java.design.patterns;

public class Main {
    public static void main(String[] args) {
        PaymentFlow paymentFlow = new PayToFriendFlow();
        paymentFlow.sendMoney();

        System.out.println("\n\n\n");

        paymentFlow = new PayToMerchantFlow();
        paymentFlow.sendMoney();
    }
}