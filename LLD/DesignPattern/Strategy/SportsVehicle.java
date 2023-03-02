package LLD.DesignPattern.Strategy;

import LLD.DesignPattern.Strategy.DriveStrategy.SpecialStrategyForDrive;

public class SportsVehicle extends Vehicle {
    SportsVehicle() {
        super(new SpecialStrategyForDrive());
    }
}
