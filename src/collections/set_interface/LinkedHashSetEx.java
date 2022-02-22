package collections.set_interface;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(3);
        linkedHashSet.add(1);
        linkedHashSet.add(8);
        linkedHashSet.add(10);

        System.out.println("linkedHashSet = " + linkedHashSet);

        linkedHashSet.remove(8);
        System.out.println("linkedHashSet.remove(8) --> " + linkedHashSet);

        System.out.println("linkedHashSet.contains(8) --> " + linkedHashSet.contains(8));
    }
}
