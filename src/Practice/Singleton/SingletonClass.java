package Practice.Singleton;

public class SingletonClass {
    private int num;
    private String name;
    private static final SingletonClass instance = new SingletonClass();

    private SingletonClass(){
    }

    public static SingletonClass getInstance() {
        return instance;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
