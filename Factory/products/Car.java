package DesignPattern.Factory.products;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public int getNumberOfTyres() {
        return 4;
    }
}
