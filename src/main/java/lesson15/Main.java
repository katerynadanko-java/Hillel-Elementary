package lesson15;

import lesson15.entity.ClassWith3Methods;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    private static AtomicInteger atomicInteger = new AtomicInteger(0);
    private static ClassWith3Methods classWith3Methods = new ClassWith3Methods();

    public static void main(String[] args) throws InterruptedException {
        Object key = new Object();
        Thread thread1 = new Thread(() -> {
            Thread.currentThread().setName("First thread");
            synchronized (key) {
                methodWithTheSameLogic();
            }
        });

        Thread thread2 = new Thread(() -> {
            Thread.currentThread().setName("Second thread");
            synchronized (key) {
                methodWithTheSameLogic();
            }
        });
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();

        Thread thread3 = new Thread(Main::methodForClassWith3Methods);
        Thread thread4 = new Thread(Main::methodForClassWith3Methods);
        Thread thread5 = new Thread(Main::methodForClassWith3Methods);
        thread3.start();
        thread4.start();
        thread5.start();
    }

    public static void methodWithTheSameLogic() {
        for (int i = 0; i < 10000; i++) {
            Thread thread = new Thread(() -> {
                atomicInteger.decrementAndGet();
            });
            thread.start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Decrement atomicInteger: " + Thread.currentThread().getName() + " " + atomicInteger.get());
    }

    public static void methodForClassWith3Methods() {
        classWith3Methods.jump();
        classWith3Methods.walk();
        classWith3Methods.dance();
    }
}
