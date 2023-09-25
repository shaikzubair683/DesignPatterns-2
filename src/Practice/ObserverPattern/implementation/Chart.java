package Practice.ObserverPattern.implementation;

import Practice.ObserverPattern.implementation.Observer;

public class Chart implements Observer {

    @Override
    public void update() {
        System.out.println("Chart updated");
    }

}

