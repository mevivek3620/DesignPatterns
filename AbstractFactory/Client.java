package DesignPattern.AbstractFactory;

import DesignPattern.AbstractFactory.factory.UIFactory;
import DesignPattern.AbstractFactory.products.Button;
import DesignPattern.AbstractFactory.products.CheckBox;

public class Client {
    private final Button button;
    private final CheckBox checkbox;
    public Client(UIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckBox();
    }

    public void renderUI() {
        button.render();
        checkbox.render();
    }
}
