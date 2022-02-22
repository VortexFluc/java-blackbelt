package lambda_expression;

public class Test2 {
    static void def(I i) {
        System.out.println(i.abc("Hello!"));
    }

    public static void main(String[] args) {
        int i = 10;
        def((String str) -> {
            System.out.println(i);
            return str.length();
        });
    }
}

interface I {
    int abc(String s);
}