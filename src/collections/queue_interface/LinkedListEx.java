package collections.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        //.add - if queue is limited, then throw excpetion when oversize
        // .offer() - if queue is limited, then there is no exception when oversize
        queue.add("Zaur");
        queue.add("Oleg");
        queue.add("Ivan");
        queue.add("Maria");
        queue.add("Alexander");

        System.out.println("queue = " + queue);

        // .remove() when queue is empty - throw exception
        // .poll() when queue is empty - return null
        System.out.println("queue.remove() --> " + queue.remove());
        System.out.println("queue = " + queue);

        //.element() when queue is empty - throw exception
        //.peek() when queue is empty - return null
        System.out.println("queue.element() --> " + queue.element());

        queue.remove("Ivan");
        System.out.println("queue after queue.remove(\"Ivan\") --> " + queue);
    }
}
