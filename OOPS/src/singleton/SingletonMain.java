package singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Singleton objOne = Singleton.getInstance();
        Singleton objTwo = Singleton.getInstance();
    }
}
