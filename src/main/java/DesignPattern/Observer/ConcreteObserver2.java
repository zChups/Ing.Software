package DesignPattern.Observer;

public class ConcreteObserver2 implements Observer{
    @Override
    public void update(int state) {
        System.out.println("Observer 2: updated a " + state+5+ " because observer2");
    }
}
