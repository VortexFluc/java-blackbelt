package collections.set_interface;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(10);
        //treeSet.add(null); NullPointerException!!!

        System.out.println("treeSet = " + treeSet);

        treeSet.remove(2);
        System.out.println("treeSet.remove(2) --> " + treeSet);

        System.out.println("treeSet.contains(1) --> " + treeSet.contains(1));
    }
}
