package designpattern.strategy.ex2;

public class Main {
    public static void main(String[] args) {
        DiscountStrategy noDiscount = new NoDiscount();
        DiscountStrategy tenPercentDiscount = new TenPercentDiscount();

        Order order = new Order(noDiscount);

        double INITIAL_AMOUNT = 100.00;

        double totalAmount = order.calculateTotal(INITIAL_AMOUNT);
        System.out.println("Totale senza sconto su ordine: " + totalAmount);

        order.setDiscountStrategy(tenPercentDiscount);
        totalAmount = order.calculateTotal(INITIAL_AMOUNT);
        System.out.println("Totale con sconto su ordine: " + totalAmount);



    }
}
