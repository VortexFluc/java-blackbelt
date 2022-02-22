package collections.list_interface;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> list = new LinkedList<>();

        for(char ch: s.toCharArray()) {
            list.add(ch);
        }

        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());

        boolean isPallindrom = true;
        while(iterator.hasNext() && reverseIterator.hasPrevious()) {
            if(iterator.next() != reverseIterator.previous()) {
                isPallindrom = false;
                break;
            }
        }

        if (isPallindrom) {
            System.out.println("It is Palindrome");
        }
        else {
            System.out.println("It isn't palindrome");
        }
    }
}
