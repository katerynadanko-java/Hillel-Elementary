package lesson14.thread;

import java.util.concurrent.Callable;

public class ImplementsCallable implements Callable<Integer> {
    private static int threadCounter = 0;

    @Override
    public Integer call() {
        for (int i = 0; i < 1000; i++) {
            Thread.currentThread().setName("Thread from ImplementsCallable Class number: " + threadCounter++);
            AdditionalClass.runAdditional();
        }
        return threadCounter;
    }
}
