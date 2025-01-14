package DesignPattern.Observer.observable;

import DesignPattern.Observer.StockEventType;
import DesignPattern.Observer.observer.Observer;
import jdk.jfr.EventType;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(StockEventType eventType, Object value);
}
