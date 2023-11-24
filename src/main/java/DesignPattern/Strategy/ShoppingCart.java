package DesignPattern.Strategy;

//context
public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public ShoppingCart(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount){
        paymentStrategy.pay(amount);
    }
}

//test
class Main{
    public static void main(String[] args) {
        PaymentStrategy creditCardPayment = new CreditCardPayment();
        PaymentStrategy payPalPayment = new PayPalPayment();

        ShoppingCart CCCart = new ShoppingCart(creditCardPayment);
        ShoppingCart PPCart = new ShoppingCart(payPalPayment);

        CCCart.checkout(150);
        PPCart.checkout(120);
    }
}