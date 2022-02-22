package collections.list_interface;

import java.util.ArrayList;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("!!!");
        arrayList2.add("???");
        arrayList2.addAll(arrayList1);
        System.out.println("arrayList2.addAll(arrayList1):" + arrayList2);

        arrayList1.clear();
        System.out.println("arrayList1.clear(): " + arrayList1);

        System.out.println("arrayList2.indexOf(\"Ivan\"): " + arrayList2.indexOf("Ivan"));
        System.out.println("arrayList2.size(): " + arrayList2.size());
        System.out.println("arrayList2.contains(\"Maria\"): " + arrayList2.contains("Maria"));
    }
}
