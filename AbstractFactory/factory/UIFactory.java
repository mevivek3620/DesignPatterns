package DesignPattern.AbstractFactory.factory;


import DesignPattern.AbstractFactory.products.Button;
import DesignPattern.AbstractFactory.products.CheckBox;

public interface UIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
