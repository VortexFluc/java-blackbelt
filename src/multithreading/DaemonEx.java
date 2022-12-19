package multithreading;

public class DaemonEx {
    public static void main(String[] args) {
        System.out.println("Main thread starts");
        UserThread userThread = new UserThread();
        userThread.setName("User-Thread");

        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("Daemon-Thread");

        userThread.start();
        daemonThread.start();
        daemonThread.setDaemon(true);
        System.out.println("Main thread ends");
    }
}

class UserThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is daemon: " + isDaemon());
        for (char i = 'A'; i<= 'J'; i++) {
            try {
                sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class DaemonThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is daemon: " + isDaemon());
        for (int i = 0; i<= 1000; i++) {
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
