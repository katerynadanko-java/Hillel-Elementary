package lesson14;

import lesson14.deadlock.Client;
import lesson14.deadlock.Passport;
import lesson14.thread.ExtendsThread;
import lesson14.thread.ImplementsCallable;
import lesson14.thread.ImplementsRunnable;

import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExtendsThread extendsThread = new ExtendsThread();
        extendsThread.start();
        extendsThread.join();

        ImplementsRunnable implementsRunnable = new ImplementsRunnable();
        Thread implementsRunnableThread = new Thread(implementsRunnable);
        implementsRunnableThread.start();
        implementsRunnableThread.join();

        ImplementsCallable implementsCallable = new ImplementsCallable();
        FutureTask<String> task = new FutureTask(implementsCallable);
        Thread implementsCallableThread = new Thread(task);
        implementsCallableThread.start();
        implementsCallableThread.join();

        Client client = new Client("Kateryna");
        Passport passport = new Passport("KO980122");

        client.setPassport(passport);
        passport.setClient(client);

        Thread deadlockThread1 = new Thread(() -> System.out.println(client.getPassportNumber()));
        Thread deadlockThread2 = new Thread(() -> System.out.println(passport.getClientName()));

        deadlockThread1.start();
        deadlockThread2.start();
    }
}
//        5.1. Диапазон результатов переменной если программу запустить несколько раз: 2997-2999
//        5.2. Диапазон результатов переменной если добавить синхронизацию и запустить программу несколько раз: 2999-2999
//        5.3. Диапазон результатов переменной если добавить (join()) и программу запустить несколько раз: 2999-2999

