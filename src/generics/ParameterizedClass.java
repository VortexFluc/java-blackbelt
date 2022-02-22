package generics;

public class ParameterizedClass {
//    public static void main(String[] args) {
//        Info<String> info1 = new Info<>("Hello, World!");
//        System.out.println(info1);
//        String s = info1.getValue();
//
//        Info<Integer> info2 = new Info<>(39);
//        System.out.println(info2);
//        Integer i = info2.getValue();
//
//        Info<Bus> info3 = new Info<>(new Bus());
//        System.out.println(info3);
//        Bus b = info3.getValue();
//    }

//    public void abc(Info<String> info) {
//        String s = info.getValue();
//    }
//
//    public void abc(Info<Integer> info) {
//        Integer i = info.getValue();
//    }
}

class Info <T extends Number & I1 & I2> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{[" + value +
                "]}";
    }
}

interface I1 {

}

interface I2 {

}

//class Parent {
//        public void abc(Info<String> info) {
//        String s = info.getValue();
//    }
//}
//
//class Child extends Parent {
////    @Override  Can't use that! Type erasure!!!
////    public void abc(Info<Integer> info) {
////        Integer i = info.getValue();
////    }
//}
//
//class Bus {
//
//}