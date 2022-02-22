package collections.queue_interface;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(3);
        deque.addFirst(5);
        deque.addLast(7);
        deque.offerFirst(1);
        deque.offerLast(8);

        System.out.println("deque = " + deque);

        System.out.println("deque.getFirst() --> " + deque.getFirst());
        System.out.println("deque.getLast() --> " + deque.getLast());
        System.out.println("deque.peekFirst() --> " + deque.peekFirst());
        System.out.println("deque.peekLast() --> " + deque.peekLast());

        System.out.println("deque.removeFirst() --> " + deque.removeFirst());
        System.out.println("deque = " + deque);
        System.out.println("deque.removeLast() --> " + deque.removeLast());
        System.out.println("deque = " + deque);
        System.out.println("deque.pollFirst() --> " + deque.pollFirst());
        System.out.println("deque = " + deque);
        System.out.println("deque.pollLast() --> " + deque.pollLast());
        System.out.println("deque = " + deque);
    }
}
