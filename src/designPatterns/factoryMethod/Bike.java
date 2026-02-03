package designPatterns.factoryMethod;

public class Bike implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Bike Driving");
    }
}
