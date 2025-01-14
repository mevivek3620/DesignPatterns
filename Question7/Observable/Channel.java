package DesignPattern.Question7.Observable;

import DesignPattern.Question7.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements  Observable {
    private String channelName;
    List<Observer> observerList = new ArrayList<>();
    public Channel(String channelName) {
        this.channelName = channelName;
        System.out.println("Channel created: " + channelName);
    }
    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }
    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }

    public void upload() {
        notifyObservers();
    }
}
