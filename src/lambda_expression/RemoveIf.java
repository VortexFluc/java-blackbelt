package lambda_expression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("Goodbye");
        list.add("Ok");
        list.add("Learn Java");
        list.add("Especially lambda");

        list.removeIf(element -> element.length() < 5);

        System.out.println("list = " + list);

        Predicate<String> p = element -> element.length() < 10;
        list.removeIf(p);
        System.out.println("list = " + list);
    }
}
