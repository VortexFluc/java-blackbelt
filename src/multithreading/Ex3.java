package multithreading;

public class Ex3 implements Runnable {
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            System.out.println("Thread3 " + i);
        }
    }
    public static void main(String[] args) {
        Thread thread = new Thread(new Ex3());
        thread.start();

        for (int i = 1000; i >= 1; i--) {
            System.out.println("Thread4 " + i);
        }
    }
}

//class MyThread3 implements Runnable {
//    @Override
//    public void run() {
//        for (int i = 0; i <= 1000; i++) {
//            System.out.println("Thread3 " + i);
//        }
//    }
//}
//
//class MyThread4 implements Runnable {
//    @Override
//    public void run() {
//        for (int i = 1000; i >= 1; i--) {
//            System.out.println("Thread4 " + i);
//        }
//    }
//}