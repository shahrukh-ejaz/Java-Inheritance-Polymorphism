
package com.inheritance8;

public class Car extends Vehicle {

    int seatingCapacity;

    Car(String brand, double rentPerDay, int seatingCapacity) {
        super(brand, rentPerDay);
        this.seatingCapacity = seatingCapacity;
    }

    public void showCarDetails() {
        System.out.println("Seating Capacity: " + seatingCapacity);
    }
}
