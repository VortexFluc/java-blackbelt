package multithreading;

public class Ex9 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main begins");
        Thread thread = new Thread(new Worker());
        System.out.println("Before start + " + thread.getState());
        thread.start();
        System.out.println("After start + " + thread.getState());
        thread.join(4000);
        System.out.println("After join + " + thread.getState());

        System.out.println("Method main ends");
    }
}

class Worker implements Runnable {
    @Override
    public void run() {
        System.out.println("Work begins");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work ends");
    }
}
