package DesignPattern.AbstractFactory.products;
import DesignPattern.AbstractFactory.products.CheckBox;
public class WindowsCheckBox implements CheckBox{
    @Override
    public void render() {
        System.out.println("Windows OS Checkbox is rendering");
        return;
    }
}
