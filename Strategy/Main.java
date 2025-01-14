package DesignPattern.Strategy;

import DesignPattern.Strategy.strategy.CreditCardPayment;
import DesignPattern.Strategy.strategy.CryptoPayment;

//     Use the Strategy pattern when you want to use different variants of an algorithm
//         within an object and be able to switch from one algorithm to another during runtime.



public class Main {
    public static void main(String[] args) {
        // credit card
        PaymentContext context = new PaymentContext(new CreditCardPayment("Vivek", "12345"));
        context.executeStrategy(100);

        // crypto payment
        context.setPaymentStrategy(new CryptoPayment("vivek@gmail.com"));
        context.executeStrategy(200);


    }
}
