package designpattern.singleton;

public class ThreadSafeLazyInitializedSingleton {
    private static volatile ThreadSafeLazyInitializedSingleton INSTANCE;

    private ThreadSafeLazyInitializedSingleton() {

    }

    public static synchronized ThreadSafeLazyInitializedSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ThreadSafeLazyInitializedSingleton();
        }
        return INSTANCE;
    }
}
