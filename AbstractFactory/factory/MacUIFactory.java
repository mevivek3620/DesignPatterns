package DesignPattern.AbstractFactory.factory;

import DesignPattern.AbstractFactory.products.*;

public class MacUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckBox();
    }
}
