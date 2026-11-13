
package com.inheritance7;

public class AccountDriver {

    public static void main(String[] args) {

        PremiumDigitalAccount account =
                new PremiumDigitalAccount(
                        "Rahul", 50000, "PAY123", 2500
                );

        account.showAccountDetails();
        account.showDigitalDetails();
        account.showPremiumDetails();
    }
}
