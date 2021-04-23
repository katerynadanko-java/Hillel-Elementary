package lesson15.entity;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ClassWith3Methods {
    Lock lock = new ReentrantLock();

    public void jumping() {
        lock.lock();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " Iteration: " + i + " I am jumping");
        }
    }

    public void walking() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " Iteration: " + i + " I am walking");
        }
    }

    public void sleeping() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " Iteration: " + i + " I am sleeping");
        }
        lock.unlock();
    }
}
