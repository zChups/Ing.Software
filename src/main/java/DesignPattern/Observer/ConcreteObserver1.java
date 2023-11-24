package DesignPattern.Observer;

public class ConcreteObserver1 implements Observer{
    @Override
    public void update(int state) {
        System.out.println("Observer 1: updated a " + state);
    }
}
