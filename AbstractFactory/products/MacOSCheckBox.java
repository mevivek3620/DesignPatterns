package DesignPattern.AbstractFactory.products;
import DesignPattern.AbstractFactory.products.CheckBox;
public class MacOSCheckBox implements CheckBox {
    @Override
    public void render() {
        System.out.println("Mac OS Checkbox is rendering");
        return;
    }
}
