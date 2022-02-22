package collections.list_interface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");

        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>(200);
        arrayList2.add("Zaur");
        arrayList2.add("Ivan");
        System.out.println(arrayList2.size());

        List<String> arrayList3 = new ArrayList<>(200);

        List<String> arrayList4 = new ArrayList<>(arrayList1);
        arrayList4.add("Andrey");
        System.out.println(arrayList4);
        System.out.println(arrayList1);

        List arrayList5 = new ArrayList<>();
        arrayList5.add(50);
        arrayList5.add("String");
        arrayList5.add(2.31);

        System.out.println(arrayList5);


    }
}
