package lambda_expression;

import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("Hello", "How are you?", "Good!", "Bye");
        for (String s: list) {
            System.out.println("s = " + s);
        }
        
        list.forEach(element -> System.out.println("element = " + element));
    }
}
