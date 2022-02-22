package collections.map_interface;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> linkedHashMap =
                new LinkedHashMap<>(16, 0.75f, true);
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Maria", "Ivanova", 1);
        Student st3 = new Student("Sergei", "Petrov", 4);
        Student st4 = new Student("Igor", "Sidorov", 2);

        linkedHashMap.put(7.2, st3);
        linkedHashMap.put(5.8, st1);
        linkedHashMap.put(6.4, st2);
        linkedHashMap.put(7.5, st4);

        System.out.println("linkedHashMap = " + linkedHashMap);

        System.out.println("linkedHashMap.get(6.4) --> " + linkedHashMap.get(6.4));
        System.out.println("linkedHashMap = " + linkedHashMap);
        System.out.println("*".repeat(40));
        System.out.println("linkedHashMap.get(7.5) --> " + linkedHashMap.get(7.5));
        System.out.println("linkedHashMap = " + linkedHashMap);
    }
}
