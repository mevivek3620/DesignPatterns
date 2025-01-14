package DesignPattern.Observer;

//e.g: Consider a Stock Market Notification System:
//
//        The Subject is the Stock, whose price changes.
//        The Observers are investors or apps subscribed to the stock's updates.
//        When the stock price changes, all observers are notified (e.g., via email, push notifications, etc.).

import DesignPattern.Observer.observable.Stock;
import DesignPattern.Observer.observer.Observer;
import DesignPattern.Observer.observer.StockPriceObserver;
import DesignPattern.Observer.observer.StockVolumeObserver;

public class Main {
    public static void main(String[] args) {
        // create the Stock object
        Stock metaStock = new Stock("Meta", 340, 2);
        Stock appleStock = new Stock("Apple", 300, 4);

        // create the observer object
        Observer stockObserver1 = new StockPriceObserver("Vivek");
        Observer stockObserver2 = new StockPriceObserver("Bob");
        Observer stockObserver3 = new StockVolumeObserver("Alice");

        // add the observer to the metaStock
        metaStock.addObserver(stockObserver1);
        appleStock.addObserver(stockObserver2);
        appleStock.addObserver(stockObserver3);

        // change the price of meta
        metaStock.setStockPrice(320);
        appleStock.setStockPrice(320);
        appleStock.setStockVolume(1);


    }
}
