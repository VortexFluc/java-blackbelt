package multithreading;

public class InterruptionEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts");
        InterruptedThread interruptedThread = new InterruptedThread();
        interruptedThread.start();

        Thread.sleep(2000);
        interruptedThread.interrupt();

        interruptedThread.join();
        System.out.println("Main ends");
    }
}

class InterruptedThread extends Thread{
    double sqrtSum = 0;
    @Override
    public void run() {
        for (int i = 1; i < 1_000_000_000; i++) {
            if (isInterrupted()) {
                System.out.println("Thread wanted to be interrupted");
                return;
            }
            sqrtSum+= Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Someone wants to interrupt thread while it sleeps. Let's end it!");
                System.out.println(sqrtSum);
                return;
            }
        }
    }
}
