package DesignPattern.Observer.observer;

import DesignPattern.Observer.StockEventType;

public class StockVolumeObserver implements Observer {
    private String name;
    public StockVolumeObserver(String name) {
        this.name = name;
    }
    @Override
    public void update(StockEventType eventType, String stockName, Object value) {
        if (eventType == StockEventType.VOLUME_UPDATE) {
            System.out.println("Event: " + eventType + "Observer name: " + this.name + " Stock name: " + stockName + " updated to volume " + value);
        }
    }

    @Override
    public String getName() {
        return this.name;
    }
}
