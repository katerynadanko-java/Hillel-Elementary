package lesson15.entity;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ClassWith3Methods {
    Lock lock = new ReentrantLock();

    public void jump() {
        lock.lock();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " Iteration: " + i + " I am jumping");
        }
    }

    public void walk() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " Iteration: " + i + " I am walking");
        }
    }

    public void dance() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " Iteration: " + i + " I am dancing");
        }
        lock.unlock();
    }
}
