package DesignPattern.Question7.Observable;

import DesignPattern.Question7.observer.Observer;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
