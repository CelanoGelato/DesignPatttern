package designpattern.singleton;

public class LazyInitializationSingleton {
    private LazyInitializationSingleton() {

    }

    private static LazyInitializationSingleton INSTANCE;

    public static LazyInitializationSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazyInitializationSingleton();
        }
        return INSTANCE;
    }
}
