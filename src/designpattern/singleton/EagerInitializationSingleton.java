package designpattern.singleton;

public class EagerInitializationSingleton {
    private EagerInitializationSingleton() {

    }

    private static final EagerInitializationSingleton INSTANCE = new EagerInitializationSingleton();

    public static EagerInitializationSingleton getInstance() {
        return INSTANCE;
    }

}
