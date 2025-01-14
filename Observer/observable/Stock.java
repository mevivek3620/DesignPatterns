package DesignPattern.Observer.observable;

import DesignPattern.Observer.StockEventType;
import DesignPattern.Observer.observer.Observer;
import DesignPattern.Observer.observer.StockPriceObserver;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Observable{
    private String stockName;
    private double stockPrice;
    private int stockVolume;
    List<Observer> observerList = new ArrayList<>();
    public Stock(String stockName, double stockPrice, int stockVolume) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        this.stockVolume = stockVolume;
    }
    public void setStockPrice(double newStockPrice) {
        this.stockPrice = newStockPrice;
        notifyObservers(StockEventType.PRICE_UPDATE, newStockPrice);
    }
    public void setStockVolume(int newStockVolume) {
        this.stockVolume = newStockVolume;
        notifyObservers(StockEventType.VOLUME_UPDATE, newStockVolume);
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
        System.out.println(observer.getName() + " added as observer" +  " for stock " + this.stockName);
    }
    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
        System.out.println(observer.getName() + " removed as observer" +  " for stock " + this.stockName);
    }
    @Override
    public void notifyObservers(StockEventType eventType, Object value) {
        for (Observer o : observerList) {
            o.update(eventType, this.stockName, value);
        }
    }
}
