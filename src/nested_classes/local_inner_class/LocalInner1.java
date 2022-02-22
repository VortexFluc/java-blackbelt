package nested_classes.local_inner_class;

public class LocalInner1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult(21, 4);
    }
}

class Math {
    private int a = 10;
    // Division division Nah :(
    public void getResult(int dividend, int divider) {
//        int dividend = 21; // effectively final - mean that after initializing the value is immutalbe

        // dividend = 33; // Can't make that because of effectively final
        // This class is unreachable even for outer class
        class Division {

//            private int divider;

//            public int getDividend() {
//                return dividend;
//            }

//            public void setDividend(int dividend) {
//                this.dividend = dividend;
//            }

//            public int getDivider() {
//                return divider;
//            }
//
//            public void setDivider(int divider) {
//                this.divider = divider;
//            }

            public int getQuotient() {
                return dividend / divider;
            }

            public int getRemainder() {
                return dividend % divider;
            }
        }

        Division division = new Division();
//        division.setDividend(21);
//        division.setDivider(4);

        System.out.println("division = " + dividend);
        System.out.println("division = " + division);
        System.out.println("division.getQuotient() = " + division.getQuotient());
        System.out.println("division.getRemainder() = " + division.getRemainder());
        System.out.println("outer class.a = " + a);
    }
}
