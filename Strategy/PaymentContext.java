package DesignPattern.Strategy;

import DesignPattern.Strategy.strategy.PaymentStrategy;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;
    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executeStrategy(int amount) {
        paymentStrategy.pay(amount);
    }
}
