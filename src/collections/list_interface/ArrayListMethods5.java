package collections.list_interface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");
        System.out.println("arrayList1: " + arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Ivan");
        arrayList2.add("Maria");
        arrayList2.add("Igor");
        System.out.println("arrayList2: " + arrayList2);

        arrayList1.removeAll(arrayList2);
        System.out.println("arrayList1.removeAll(arrayList2): " + arrayList1);

        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        arrayList1.retainAll(arrayList2);
        System.out.println("arrayList1.retainAll(arrayList2): " + arrayList1);

        boolean result = arrayList1.containsAll(arrayList2);  //true if Igor removed
        System.out.println("arrayList1.containsAll(arrayList2): " + result);

        arrayList1.add("Zaur");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");
        List<String> myList = arrayList1.subList(1, 4);
        System.out.println("arrayList1.subList(1, 4): " + myList);

        myList.add("Fyodor");
        System.out.println("myList.add(\"Fyodor\"): " + myList);
        System.out.println("BUT arrayList1 also changed: " + arrayList1);

        arrayList1.add("Sveta");
        System.out.println("arrayList1 after arrayList1.add(\"Sveta\"): " + arrayList1);
        //System.out.println(myList); <--- CAN'T USE THIS METHOD AFTER MODIFYING THE ORIGINAL ARRAY LIST!!!!!

        Object[] array = arrayList1.toArray();
        String[] array2 = arrayList1.toArray(new String[0]); // Need to declare the size of array in method parameters
        for (String s: array2) {
            System.out.print(s + " ");
        }
        System.out.println();

        List<Integer> list1 = List.of(3, 8, 13);
        System.out.println("List.of(3, 8, 13): " + list1);

        //list1.add(100); EXCEPTION!!! This list is immutalble!

        List<String> list2 = List.copyOf(arrayList1);
        System.out.println("List.copyOf(arrayList1): " + list2);

        //list2.add("Andrey"); EXCEPTION!!! <- This list is also immutable

    }
}
