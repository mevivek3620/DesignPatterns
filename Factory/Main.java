package DesignPattern.Factory;

//    Q. When to use the Factory method pattern?
//        There should be a set of classes which implement a common interface
//        You don’t know which object to create ( You know which object to create only at run time)
//        Object initialization is somewhat expensive(Have to do some operations in order to create an object)

import DesignPattern.Factory.factory.VehicleFactory;
import DesignPattern.Factory.products.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicle("car");
        car.start();

        Vehicle bike = VehicleFactory.getVehicle("bike");
        bike.start();

        System.out.println("Number of tyres in bike: " + bike.getNumberOfTyres());
        System.out.println("Number of tyres in car: " + car.getNumberOfTyres());
    }
}
