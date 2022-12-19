package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx2 {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
//        for (int i = 0; i < 10; i++) {
//            executorService.execute(new RunnableImpl200());
//        }

//        scheduledExecutorService.schedule(new RunnableImpl200(), 3, TimeUnit.SECONDS);

//        scheduledExecutorService.scheduleAtFixedRate(new RunnableImpl200(), 3, 1, TimeUnit.SECONDS);
//        Thread.sleep(20000);

//        scheduledExecutorService.scheduleWithFixedDelay(new RunnableImpl200(), 3, 1, TimeUnit.SECONDS);
        Thread.sleep(20000);
        scheduledExecutorService.shutdown();

        ExecutorService executorService = Executors.newCachedThreadPool();
    }
}

class RunnableImpl200 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begin to work.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " end of work.");
    }
}

