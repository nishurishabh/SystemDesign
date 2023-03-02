package LLD.DesignPattern.Strategy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main Function called");
        Vehicle passengerVehicle = new PassengerVehicle();
        Vehicle sportVehicle = new SportsVehicle();

        passengerVehicle.driveStrategyObj.drive("Passenger Car");
        sportVehicle.driveStrategyObj.drive("Sports Car");
    }
}
