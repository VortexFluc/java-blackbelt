package multithreading;

public class DeadlockEx {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();

        thread10.start();
        thread20.start();
    }
}

class Thread10 extends Thread {

    @Override
    public void run() {
        System.out.println("Thread10: Trying to lock objects monitor lock1");
        synchronized (DeadlockEx.lock1) {
            System.out.println("Thread10: Monitor of object lock1 captured");

            System.out.println("Thread10: Trying to lock objects monitor lock2");
            synchronized (DeadlockEx.lock2) {
                System.out.println("Thread10: Monitor of objects lock1, lock2 captured");
            }
        }
    }
}

class Thread20 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread20: Trying to lock objects monitor lock2");
        synchronized (DeadlockEx.lock2) {
            System.out.println("Thread20: Monitor of object lock2 captured");

            System.out.println("Thread20: Trying to lock objects monitor lock1");
            synchronized (DeadlockEx.lock1) {
                System.out.println("Thread20: Monitor of objects lock1, lock2 captured");
            }
        }
    }
}
