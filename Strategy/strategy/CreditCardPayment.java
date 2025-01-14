package DesignPattern.Strategy.strategy;

public class CreditCardPayment implements PaymentStrategy {
    private String name;
    private String cardNumber;

    public CreditCardPayment(String name, String cardNumber) {
        this.cardNumber = cardNumber;
        this.name = name;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Payment done by credit card number: " + cardNumber + " of amount: " + amount);
    }
}
