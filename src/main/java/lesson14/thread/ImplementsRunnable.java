package lesson14.thread;

public class ImplementsRunnable implements Runnable {
    @Override
    public void run() {
        runAdditionalInImplementsRunnable();
    }
    public static void runAdditionalInImplementsRunnable(){
        for (int i = 0; i < 1000; i++) {
            AdditionalClass.runAdditional();
        }
    }

}
