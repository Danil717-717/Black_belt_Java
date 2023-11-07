package lambda.consumerInfo;



import nested_classes.inner_class.Car;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test5 {
    public static ArrayList<Car1> createTreeCars(Supplier<Car1> carSupplier){
        ArrayList<Car1 > al = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            al.add(carSupplier.get());
        }
        return al;
    }

    public static void changeCar(Car1 car, Consumer<Car1>car1Consumer){
        car1Consumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car1> ourCars = createTreeCars(() ->
                new Car1("Nissan", "Silver", 1.6));
        System.out.println("OurCars: " + ourCars);

        changeCar(ourCars.get(0),
                car1->{car1.color = "red";
                       car1.engine = 2.4;
                    System.out.println("upgrade car: " + car1);});

        System.out.println("OurCars: " + ourCars);

    }

}

class Car1{
    String model;
    String color;
    double engine;

    public Car1(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }


    @Override
    public String toString() {
        return "Car1: {" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
