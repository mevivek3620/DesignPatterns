package DesignPattern.Factory.factory;

import DesignPattern.Factory.products.Bike;
import DesignPattern.Factory.products.Vehicle;
import DesignPattern.Factory.products.Car;

public class VehicleFactory {
    public static Vehicle getVehicle(String type) {
        if (type.equals("car")) {
            Vehicle Car = new Car();
            return Car;
        } else if (type.equals("bike")) {
            Vehicle Bike = new Bike();
            return Bike;
        }
        return null;
    }
}
