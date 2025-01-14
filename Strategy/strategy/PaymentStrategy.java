package DesignPattern.Strategy.strategy;

//      Use the Strategy when you have a lot of similar classes that only differ in the way they execute some behavior.

public interface PaymentStrategy {
    void pay(int amount);
}
