package LLD.DesignPattern.Strategy.DriveStrategy;

public class NormalStrategyForDrive implements DriveStrategy {
    @Override
    public void drive(String vehicleName) {
        System.out.println("Normal drive strategy used by passenger vehicles");
        System.out.println("You are driving: "+vehicleName);
    }
}
