package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee("Andrey", lock);
        new Employee("Vika", lock);
        new Employee("Artem", lock);

        Thread.sleep(5000);
        new Employee("Dima", lock);
        new Employee("Lesha", lock);
    }
}

class Employee extends Thread {
    String name;
    private final Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        if (lock.tryLock()) {
            try {
//            System.out.println(name + " wait.");
//            lock.lock();
                System.out.println(name + " using bankomat.");
                Thread.sleep(2000);
                System.out.println(name + " finished");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + " don't want wait.");
        }
    }
}
