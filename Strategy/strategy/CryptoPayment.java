package DesignPattern.Strategy.strategy;

public class CryptoPayment implements PaymentStrategy {
    private String email;
    public CryptoPayment(String email) {
        this.email =  email;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Payment done by Crypto currency of amount: " + amount + " by email: " + email);
    }
}
