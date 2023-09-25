package Practice.ObserverPattern.implementation;

import Practice.ObserverPattern.implementation.Observer;

public class SpreadSheet implements Observer {
    @Override
    public void update() {
        System.out.println("spreadsheet updated");
    }
}
