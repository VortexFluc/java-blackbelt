package nested_classes.static_nested_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    private static int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    void method() {
        System.out.println(Engine.countOfObjects);
        // If we want to use private non-static field of static nested class we need to create object of it
        Engine e = new Engine(251);
        System.out.println(e.horsePower);
    }

    public static class Engine {
        private int horsePower;
        static int countOfObjects;

        public Engine(int horsePower) {
            System.out.println("a = " + a); // even private field are visible for static nested class
            // System.out.println("doorCount = " + doorCount); Error - doorCount is non static field!
            this.horsePower = horsePower;
            countOfObjects++;
        }

        @Override
        public String toString() {
            return "My engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(254);
        System.out.println("engine = " + engine);

        Car car = new Car("red", 2, engine);
        System.out.println("car = " + car);

        //Car.Engine engine2 = new car.Engine(150); INCORRECT!!! Cause of static!
    }
}

class Z extends Car.Engine {
    Z() {
        super(200);
    }
}
