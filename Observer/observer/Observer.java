package DesignPattern.Observer.observer;

import DesignPattern.Observer.StockEventType;

public interface Observer {
    void update(StockEventType eventType, String stockName, Object value);
    String getName();
}
