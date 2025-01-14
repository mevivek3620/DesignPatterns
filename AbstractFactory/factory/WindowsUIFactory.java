package DesignPattern.AbstractFactory.factory;

import DesignPattern.AbstractFactory.products.Button;
import DesignPattern.AbstractFactory.products.CheckBox;
import DesignPattern.AbstractFactory.products.WindowsButton;
import DesignPattern.AbstractFactory.products.WindowsCheckBox;

public class WindowsUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
