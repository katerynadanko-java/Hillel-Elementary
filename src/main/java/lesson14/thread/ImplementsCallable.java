package lesson14.thread;

import java.util.concurrent.Callable;

public class ImplementsCallable implements Callable<Integer> {
    @Override
    public Integer call() {
        for (int i = 0; i < 1000; i++) {
            AdditionalClass.runAdditional();
        }
        return null;

    }
}
