package LLD.DesignPattern.Strategy;

import LLD.DesignPattern.Strategy.DriveStrategy.NormalStrategyForDrive;

public class PassengerVehicle extends Vehicle{
    PassengerVehicle() {
        super(new NormalStrategyForDrive());
    }
}
