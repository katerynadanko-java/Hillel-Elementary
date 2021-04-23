package lesson14.thread;

import java.util.concurrent.Callable;

public class ImplementsCallable implements Callable<Integer> {
    @Override
    public Integer call() {
        runAdditionalInImplementsCallable();
        return null;
    }

    public static void runAdditionalInImplementsCallable() {
        for (int i = 0; i < 1000; i++) {
            AdditionalClass.runAdditional();
        }
    }
}
