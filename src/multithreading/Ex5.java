package multithreading;

public class Ex5 {
    public static void main(String[] args) {
        MyThread5 thread = new MyThread5();
        thread.setName("mineThread");
        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Name of thread = " + thread.getName() +
                " Priority of thread = " + thread.getPriority());
    }
}

class MyThread5 extends Thread {
    public void run() {
        System.out.println("Hello!");
    }
}
