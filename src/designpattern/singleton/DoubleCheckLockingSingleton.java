package designpattern.singleton;

import com.sun.scenario.effect.impl.prism.PrImage;

public class DoubleCheckLockingSingleton {
    private static volatile DoubleCheckLockingSingleton INSTANCE;

    private DoubleCheckLockingSingleton() {

    }

    private static DoubleCheckLockingSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (DoubleCheckLockingSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckLockingSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
