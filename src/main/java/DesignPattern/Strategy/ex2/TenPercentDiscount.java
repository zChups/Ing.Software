package designpattern.strategy.ex2;

public class TenPercentDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return 0.9 * amount;
    }
}
