package DesignPattern.AbstractFactory.products;

import DesignPattern.AbstractFactory.products.Button;
public class MacOSButton implements Button {
    @Override
    public void render() {
        System.out.println("Mac OS Button is rendering");
        return;
    }
}
