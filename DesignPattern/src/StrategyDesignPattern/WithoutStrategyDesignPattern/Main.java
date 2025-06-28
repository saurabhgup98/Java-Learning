package StrategyDesignPattern.WithoutStrategyDesignPattern;

class Vehicle {

    public void drive(){
        System.out.println("Normal Drive Capability:: Method Definition inside Parent Vehicle Class");
    }
}

class SportsVehicle extends Vehicle{

    public void drive(){
        System.out.println("Sports Drive Capability:: Method Definition inside Child SportsVehicle Class");
    }
}

class PassengerVehicle extends Vehicle{
    // It makes use of Parent Vehicle Drive method
}

class OffRoadVehicle extends Vehicle{

    @Override
    public void drive(){
        System.out.println("Sports Drive Capability:: Method Definition inside Child OffRoadVehicle Class");
    }
}



public class Main {


    public static void main(String[] args) {
        var offRoadVehicle = new OffRoadVehicle();
        var sportsVehicle = new SportsVehicle();
        var passengerVehicle = new PassengerVehicle();

        System.out.println("Let's check the drive Method without Using Strategy Design Pattern-----");
        System.out.println("offRoadVehicle Drive method:: " );
        offRoadVehicle.drive();
        System.out.println("sportsVehicle Drive method:: " );
        sportsVehicle.drive();
        System.out.println("passengerVehicle Drive method:: " );
        passengerVehicle.drive();
    }
}
