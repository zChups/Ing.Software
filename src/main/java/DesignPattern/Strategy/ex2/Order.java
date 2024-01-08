package designpattern.strategy.ex2;

public class Order {
    private DiscountStrategy discountStrategy;

    public Order(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateTotal(double amount){
        return discountStrategy.applyDiscount(amount);
    }
}
