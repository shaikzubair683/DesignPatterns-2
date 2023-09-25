package Practice.ObserverPattern;
import Practice.ObserverPattern.implementation.Observer;

import java.util.ArrayList;


public class Subject {
    private ArrayList<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for(Observer observer : observers){
            observer.update();
        }
    }

}
