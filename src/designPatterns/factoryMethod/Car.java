package designPatterns.factoryMethod;

public class Car implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Car Driving");
    }
}
