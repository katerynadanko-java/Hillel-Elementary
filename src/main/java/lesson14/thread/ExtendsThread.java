package lesson14.thread;

public class ExtendsThread extends Thread {
    private static int threadCounter = 0;

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Thread.currentThread().setName("Thread from ExtendsThread Class number: " + threadCounter++);
            AdditionalClass.runAdditional();
        }
    }
}
