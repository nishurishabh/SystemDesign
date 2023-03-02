package LLD.DesignPattern.Strategy;

import LLD.DesignPattern.Strategy.DriveStrategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveStrategyObj;

    // This is known as constructor injection
    // Derived class will pass the object while declaring objects.
    Vehicle(DriveStrategy driveStrategyObj) {this.driveStrategyObj = driveStrategyObj;}
    public void drive() {
        System.out.println("Entered the base class drive func");
        String vehicleName = "Cars";
        driveStrategyObj.drive(vehicleName);
    }
}