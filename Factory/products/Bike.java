package DesignPattern.Factory.products;

public class Bike implements Vehicle{
    @Override
    public void start() {
        System.out.println("Bike is starting");
    }

    @Override
    public int getNumberOfTyres() {
        return 2;
    }
}
