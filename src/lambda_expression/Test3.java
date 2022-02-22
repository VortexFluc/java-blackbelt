package lambda_expression;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class Test3 {
    public static void main(String[] args) {
        List<Car> ourCars = createThreeCars(() -> new Car("Tesla", "Yellow", 0.0));
        System.out.println("ourCars = " + ourCars);

        changeCar(ourCars.get(0), car -> {
            car.color = "black";
            car.engineVolume = 2.0;
            System.out.println("Upgraded car: " + car);
        });

        System.out.println("ourCars = " + ourCars);
    }

    public static List<Car> createThreeCars(Supplier<Car> carSupplier) {
        List<Car> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(carSupplier.get());
        }
        return list;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }
}

class Car {
    String model;
    String color;
    double engineVolume;

    public Car(String model, String color, double engineVolume) {
        this.model = model;
        this.color = color;
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}