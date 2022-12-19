package multithreading;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx {
    public static void main(String[] args) throws InterruptedException {
        Map<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Andrey");
        map.put(2, "Oleg");
        map.put(3, "Elena");
        map.put(4, "Victor");
        map.put(5, "Marina");

        System.out.println(map);

        Runnable runnable = () -> {
            Iterator<Integer> iterator = map.keySet().iterator();

            while (iterator.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Integer i = iterator.next();
                System.out.println(i + " : " + map.get(i));
            }
        };

        Runnable runnable1 = () -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            map.put(6, "Victoria");
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable1);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(map);

    }
}
