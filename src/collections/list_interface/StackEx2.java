package collections.list_interface;

import java.util.Stack;

public class StackEx2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Zaur");
        stack.push("Misha");
        stack.push("Oleg");
        stack.push("Katya");

        System.out.println("stack = " + stack);
//        System.out.println("stack.pop(): " + stack.pop());
//        System.out.println("stack.pop(): " + stack.pop());
//        System.out.println("stack.pop(): " + stack.pop());
//        System.out.println("stack.pop(): " + stack.pop());
//        System.out.println("stack = " + stack);
//
//        System.out.println("stack.pop(): " + stack.pop()); // Exception: Stack is empty!

//        while (!stack.isEmpty()) {
//            System.out.println("stack.pop(): " + stack.pop());
//            System.out.println("stack = " + stack);
//        }

        System.out.println("stack.peek(): " + stack.peek());
        System.out.println("stack = " + stack);
    }
}
