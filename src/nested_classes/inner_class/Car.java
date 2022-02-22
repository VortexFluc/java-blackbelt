package nested_classes.inner_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;


    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
//        this.engine = this.new Engine(horsePower);
    }

    public void setEngine(Engine engine) {
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

//    void method() {
//        System.out.println(Engine.countOfObjects);
//        // If we want to use private non-static field of static nested class we need to create object of it
//        Engine e = new Engine(251);
//        System.out.println(e.horsePower);
//    }

    public class Engine {
        private int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
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
//        Car.Engine engine = new Car.Engine(254); Can't make this
//        Instead we create inner class in constructor if outer class
//        Car car = new Car("black", 4, 300);
//        Or we can use instance of class to produce inner class via method
        Car car = new Car("black", 4);
        Car.Engine engine = car.new Engine(150);
        System.out.println(car);

        // We can do this. But WTF?
        Car.Engine engine1 = new Car("yellow", 4).new Engine(200);

    }
}
