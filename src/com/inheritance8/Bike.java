
package com.inheritance8;

public class Bike extends Vehicle {

    boolean helmetIncluded;

    Bike(String brand, double rentPerDay, boolean helmetIncluded) {
        super(brand, rentPerDay);
        this.helmetIncluded = helmetIncluded;
    }

    public void showBikeDetails() {
        System.out.println("Helmet Included: " + helmetIncluded);
    }
}

