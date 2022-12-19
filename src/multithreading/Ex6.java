package multithreading;

public class Ex6 implements Runnable{
    @Override
    public void run() {
        System.out.println("Method run. Thread name = "
                + Thread.currentThread().getName() + "; Priority = " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Ex6());
        thread.start();

        System.out.println("Method run. Thread name = "
                + Thread.currentThread().getName() + "; Priority = " + Thread.currentThread().getPriority());
    }
}
