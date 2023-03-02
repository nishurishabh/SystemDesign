package LLD.DesignPattern.Strategy.DriveStrategy;

public class SpecialStrategyForDrive implements DriveStrategy {

    @Override
    public void drive(String vehicleName) {
        System.out.println("Special drive strategy used by sports vehicles");
        System.out.println("You are driving: "+vehicleName);
    }
}
