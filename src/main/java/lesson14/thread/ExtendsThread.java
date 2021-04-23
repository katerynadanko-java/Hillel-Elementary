package lesson14.thread;

public class ExtendsThread extends Thread {

    @Override
    public void run() {
        runAdditionalInExtendsThread();
    }

    public static void runAdditionalInExtendsThread() {
        for (int i = 0; i < 1000; i++) {
            AdditionalClass.runAdditional();
        }
    }
}
