package DesignPattern.Strategy;

public class PayPalPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Payed with PP");
    }
}
