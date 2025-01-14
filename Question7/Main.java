package DesignPattern.Question7;

import DesignPattern.Question7.Observable.Channel;
import DesignPattern.Question7.observer.Observer;
import DesignPattern.Question7.observer.VideoObserver;

public class Main {
    public static void main(String[] args) {
        Channel channel = new Channel("Vivek's Channel");

        Observer observer1 = new VideoObserver("Vivek");
        channel.addObserver(observer1);

        Observer observer2 = new VideoObserver("Alice");
        channel.addObserver(observer2);

        channel.upload();
    }
}
