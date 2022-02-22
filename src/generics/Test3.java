package generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
//        List<Number> list = new ArrayList<Integer>();
//        List<Object> list = new ArrayList<Integer>();

        List<?> list = new ArrayList<String>();
//        list.add("Hello!");

      // Bounded wildcards
        List<? extends Number> list3 = new ArrayList<Integer>();
        List<? super Number> list4 = new ArrayList<Object>();

        List<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("World!");
        list1.add("!!!");

        showListInfo(list1);

        ArrayList<Double> arrayListDouble = new ArrayList<>();
        arrayListDouble.add(3.14);
        arrayListDouble.add(3.15);
        arrayListDouble.add(3.16);

        System.out.println(sum(arrayListDouble));

        ArrayList<Integer> arrayListInteger = new ArrayList<>();
        arrayListInteger.add(3);
        arrayListInteger.add(35);
        arrayListInteger.add(30);

        System.out.println(sum(arrayListInteger));
    }

    static void showListInfo(List<?> list) {
        System.out.println("List: " + list);
    }

    public static double sum(ArrayList<? extends Number> arrayList) {
        double sum = 0;
        for (Number n : arrayList) {
            sum += n.doubleValue();
        }
        return sum;
    }
}
