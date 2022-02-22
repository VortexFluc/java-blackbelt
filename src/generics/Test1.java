package generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

//        list.add("OK");
//        list.add(5);
//        list.add(new StringBuilder("asdfsadfs"));
        list.add("privet");
        list.add("poka");
        list.add("padfsdfsdfsdf");

        for (String obj: list) {
            System.out.println(obj + " obj.length: " + obj.length());
        }
    }
}
