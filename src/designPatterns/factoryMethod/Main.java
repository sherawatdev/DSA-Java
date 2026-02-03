package designPatterns.factoryMethod;

public class Main {

    public static void main(String[] args) {
        VehicleFactory v1 = new BikeFactory();
        Vehicle vehicle1 = v1.createVehicle();
        vehicle1.drive();

        VehicleFactory v2 = new CarFactory();
        Vehicle vehicle2 = v2.createVehicle();
        vehicle2.drive();
    }
}
