package collections.map_interface;

import com.sun.source.tree.Tree;

import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Maria", "Ivanova", 1);
        Student st3 = new Student("Sergei", "Petrov", 4);
        Student st4 = new Student("Igor", "Sidorov", 2);
        Student st5 = new Student("Vasiliy", "Smirnov", 1);
        Student st6 = new Student("Sasha", "Kapustin", 3);
        Student st7 = new Student("Elena", "Sidorova", 4);
//        Student st8 = new Student("Elena", "Sidorova", 4);
//        Student st9 = new Student("Petr", "Sidorov", 4);

        treeMap.put(7.9, st5);
        treeMap.put(6.4, st2);
        treeMap.put(7.2, st3);
        treeMap.put(5.8, st1);
        treeMap.put(8.2, st6);
//        treeMap.put(3.2, st8);
        treeMap.put(9.1, st7);
        treeMap.put(7.5, st4);
//        treeMap.put(9.1, st9); // Key must be unique like in HashMap

        System.out.println("treeMap = " + treeMap);

        System.out.println("treeMap.get(6.4) --> " + treeMap.get(6.4));

//        treeMap.remove(5.8);
//        System.out.println("treeMap.remove(5.8): " + treeMap);

        System.out.println("treeMap.descendingMap() --> " + treeMap.descendingMap());

        System.out.println("treeMap.tailMap(7.3) --> " + treeMap.tailMap(7.3));

        System.out.println("treeMap.headMap(7.3) --> " + treeMap.headMap(7.3));

        System.out.println("treeMap.lastEntry() --> " + treeMap.lastEntry());

        System.out.println("treeMap.firstEntry() --> " + treeMap.firstEntry());

        System.out.println("*".repeat(40));
//        -------------------------------------------------------------------
        TreeMap<Student, Double> treeMap2 = new TreeMap<>(); //Key data type must implements Comparable<T>
        // or we can use Comparator as second argument in TreeMap constructor!!
        treeMap2.put(st5, 7.9);
        treeMap2.put(st2, 6.4);
        treeMap2.put(st3, 7.2);
        treeMap2.put(st1, 5.8);
        treeMap2.put(st6, 8.2);
        treeMap2.put(st7, 9.1);
        treeMap2.put(st4, 7.5);

        System.out.println("treeMap2 = " + treeMap2);

        Student st8 = new Student("Elena", "Sidorova", 4);
        System.out.println("treeMap2.containsKey(st8) --> " + treeMap2.containsKey(st8));
    }

}
