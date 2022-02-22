package generics;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        int a = GenMethod.getSecondElement(arrayList);
        System.out.println(a);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("ABC");
        arrayList2.add("EFG");
        arrayList2.add("HIJ");
        String b = GenMethod.getSecondElement(arrayList2);
        System.out.println(b);
    }

}

class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> arrayList) {
        return arrayList.get(1);
    }
}
