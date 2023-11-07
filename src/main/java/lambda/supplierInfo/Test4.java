package lambda.supplierInfo;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Test4 {
    public static ArrayList<Car> createTreeCars(Supplier<Car> carSupplier){
        ArrayList<Car > al = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            al.add(carSupplier.get());
        }
        return al;
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createTreeCars(() ->
                new Car("Nissan", "Silver", 1.6));
        System.out.println("OurCars: " + ourCars);
    }
}

class Car{
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
