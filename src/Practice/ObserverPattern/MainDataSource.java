package Practice.ObserverPattern;


public class MainDataSource extends Subject{
    private int value = 9;

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
        notifyObservers();
    }

}
