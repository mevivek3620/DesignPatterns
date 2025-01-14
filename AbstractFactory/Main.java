package DesignPattern.AbstractFactory;

//    Key Takeaway
//        Normal Factory:
//        --> Use it when there is a single product type with different variations (e.g., Car and Bike).
//        --> Factory class.
//
//        Abstract Factory:
//        --> Use it when there are multiple related product families and you want to create all products
//              in a family together (e.g., ElectricCar and ElectricEngine).
//        --> Abstract Factory(interface) and then concrete factory(class).


// Abstract Factory Example:
//        We'll build a system for creating UI components for two platforms: Windows and MacOS.
//        Each platform has its own specific implementation of Buttons and Checkboxes.

import DesignPattern.AbstractFactory.factory.MacUIFactory;
import DesignPattern.AbstractFactory.factory.UIFactory;
import DesignPattern.AbstractFactory.factory.WindowsUIFactory;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select platform (Windows/MacOS): ");
        String platform = sc.nextLine();

        UIFactory factory;
        if (platform.equals("Windows")) {
            factory = new WindowsUIFactory();
        } else if (platform.equals("MacOS")) {
            factory = new MacUIFactory();
        } else {
            throw new IllegalArgumentException("Unsupported platform " + platform);
        }

        Client client = new Client(factory);
        client.renderUI();
    }
}
