package designpattern.strategy.ex2;

public class NoDiscount implements DiscountStrategy{
    @Override
    public double applyDiscount(double amount) {
        return amount;
    }
}
