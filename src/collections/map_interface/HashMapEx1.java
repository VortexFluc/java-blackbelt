package collections.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        // Keys must be unique! Or the freshest value is override the old value of the same key.
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Zaur Tregulov");
        map1.put(3548, "Ivan Ivanov");
        map1.put(6578, "Maria Sidorova");
        map1.put(15879, "Nikolay Petrov");
        map1.putIfAbsent(1000, "Oleg Ivanov"); // putIfAbsent - if key is present, then you mustn't add this

        System.out.println("map1 = " + map1);
        System.out.println("map1.get(1000): " + map1.get(1000));

        map1.remove(15879);
        System.out.println("map1.remove(15879): " + map1);

        System.out.println("map1.containsValue(\"Ivan Ivanov\"): " + map1.containsValue("Ivan Ivanov"));

        System.out.println("map1.containsKey(500): " + map1.containsKey(500));

        System.out.println("map1.keySet(): " + map1.keySet());

        System.out.println("map1.values(): " + map1.values());
    }
}
