package Practice.ObserverPattern.implementation;

import Practice.ObserverPattern.implementation.Observer;

public class Web implements Observer {
    @Override
    public void update() {
        System.out.println("Web updated");
    }
}
