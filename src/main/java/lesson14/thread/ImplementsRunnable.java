package lesson14.thread;

public class ImplementsRunnable implements Runnable {
    private static int threadCounter = 0;

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Thread.currentThread().setName("Thread from ImplementsRunnable Class number: " + threadCounter++);
            AdditionalClass.runAdditional();
        }
    }
}
