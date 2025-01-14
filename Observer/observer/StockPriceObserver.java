package DesignPattern.Observer.observer;

import DesignPattern.Observer.StockEventType;

public class StockPriceObserver implements Observer {
    private String name;
    public StockPriceObserver(String name) {
        this.name = name;
    }
    @Override
    public void update(StockEventType eventType, String stockName, Object value) {
        if (eventType == StockEventType.PRICE_UPDATE) {
            System.out.println("Event: " + eventType + " Stock of " + stockName + " updated to price " + value);
        } else {
            System.out.println("Incorrect Event: " + eventType + " Stock of " + stockName);
        }
    }

    @Override
    public String getName() {
        return this.name;
    }
}
