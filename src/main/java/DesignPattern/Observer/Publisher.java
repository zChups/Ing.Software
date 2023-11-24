package DesignPattern.Observer;


import java.util.ArrayList;
import java.util.List;

//subject
public class Publisher {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public void addObserver(Observer newObserver){
        observers.add(newObserver);
    }

    public void removeObserver(Observer cancObserver){
        observers.remove(cancObserver);
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    public void notifyObservers(){
        for (Observer observer : observers){
            observer.update(state);
        }
    }

}

class Main{
    public static void main(String[] args) {
        Publisher subject = new Publisher();
        ConcreteObserver1 observer1 = new ConcreteObserver1();
        ConcreteObserver2 observer2 = new ConcreteObserver2();

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.setState(10);
    }
}
