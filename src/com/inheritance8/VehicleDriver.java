
package com.inheritance8;

public class VehicleDriver {

    public static void main(String[] args) {

        Car car = new Car("Hyundai", 2000, 5);

        System.out.println("--- CAR DETAILS ---");
        car.showDetails();
        car.showCarDetails();
        car.calculateRent(3);

        System.out.println();

        Bike bike = new Bike("Royal Enfield", 800, true);

        System.out.println("--- BIKE DETAILS ---");
        bike.showDetails();
        bike.showBikeDetails();
        bike.calculateRent(2);
    }
}
