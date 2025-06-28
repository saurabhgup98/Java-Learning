package StrategyDesignPattern;

interface DriveStrategy {
     void driveStrategy();
}

class SportsDriveStrategy implements DriveStrategy{
    @Override
    public void driveStrategy() {
        System.out.println("Sports Drive Capability:: Method Definition inside SportsDrive Strategy Class");
    }
}

class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void driveStrategy() {
        System.out.println("Normal  Drive Capability:: Method Definition inside NormalDriveStrategy Class");
    }
}

class Vehicle {
    DriveStrategy driveStrategyObj;

    public Vehicle(DriveStrategy driveStrategyObj) {
        this.driveStrategyObj = driveStrategyObj;
    }

    public void setDriveStrategyObj(DriveStrategy driveStrategyObj) {
        this.driveStrategyObj = driveStrategyObj;
    }

    public void drive(){
        driveStrategyObj.driveStrategy();
    }
}

class SportsVehicle extends Vehicle {
    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}

class PassengerVehicle extends Vehicle{
    PassengerVehicle(){
        super(new NormalDriveStrategy());
    }
}

class OffRoadVehicle extends Vehicle{
    OffRoadVehicle(DriveStrategy driveStrategy){
        super(new SportsDriveStrategy());
    }
}

public class WithStrategyDesignPattern {
    public static void main(String[] args) {
        var offRoadVehicle = new OffRoadVehicle(new SportsDriveStrategy());
        var sportsVehicle = new SportsVehicle();
        var passengerVehicle = new PassengerVehicle();

        System.out.println("Let's check the drive Method Using Strategy Design Pattern-----");
        System.out.println("offRoadVehicle Drive method:: " );
        offRoadVehicle.drive();
        System.out.println("sportsVehicle Drive method:: " );
        sportsVehicle.drive();
        System.out.println("passengerVehicle Drive method:: " );
        passengerVehicle.drive();
        passengerVehicle.setDriveStrategyObj(new SportsDriveStrategy());
        System.out.println("Passenger Vehicle Drive method after changing new Drive strategy");
        passengerVehicle.drive();

    }
}
