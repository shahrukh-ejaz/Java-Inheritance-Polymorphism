
package com.inheritance7;

public class PremiumDigitalAccount extends DigitalAccount {

    double cashback;

    PremiumDigitalAccount(String accountHolder, double balance,
                          String paymentId, double cashback) {

        super(accountHolder, balance, paymentId);
        this.cashback = cashback;
    }

    public void showPremiumDetails() {
        System.out.println("Cashback: " + cashback);
    }
}
