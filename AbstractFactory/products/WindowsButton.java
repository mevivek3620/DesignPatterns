package DesignPattern.AbstractFactory.products;

import DesignPattern.AbstractFactory.products.Button;
public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Windows OS Button is rendering");
        return;
    }
}
