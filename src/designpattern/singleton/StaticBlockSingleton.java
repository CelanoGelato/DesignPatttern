package designpattern.singleton;

public class StaticBlockSingleton {
    private static final StaticBlockSingleton INSTANCE;

    private StaticBlockSingleton() {

    }

    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("StaticBlockSingleton");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }
}
