package StrategyDesignPattern.WithoutStrategyDesignPattern;

import java.util.Arrays;

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
    public static int[] twoSum(int[] A, int target) {
        // add your logic here
        for(int i = 0; i < A.length - 1; i++){
            for(int j = i+ 1; j < A.length; j++){
                if((A[i] + A[j]) == target){
                    System.out.println("i is::" + A[i] + " j is:: " + A[j]);
                    return new int[] {i,j};

                }
            }
        }
        return new int[]{};
    }

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
        System.out.println(Arrays.toString(twoSum(new int[]{1, 3, 3, 4}, 5)));
    }
}
