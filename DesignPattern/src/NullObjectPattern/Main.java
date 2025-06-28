package NullObjectPattern;

public class Main {

    private static void printVehicleDetails(Vehicle vehicle){
        System.out.println("Seating Capacity:: " + vehicle.getSeatingCapacity());
        System.out.println("Fuel Tank Capacity :: " + vehicle.getTankCapacity());
    }

    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicleObject("Car");
        printVehicleDetails(vehicle);
    }
}
