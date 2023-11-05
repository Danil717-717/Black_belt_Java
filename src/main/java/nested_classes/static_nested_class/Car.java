package nested_classes.static_nested_class;

/*
   static nested класс очень похож на обычный
   внешний, но находится внутри другого класса

   Создавая обьект static nested класса, нужно
   указывать и класс, содержащий его

   могут быть приватными, абстрактными, финал
   может екстендить и его могут екстендить

   может содержать static и non-static элементы

   может обращаться даже к приватным элементам
   внешнего класса, но только статик

   внешний класс может обращаться даже к приват
   элементам static nested класса
 */
public class Car {
    String color;
    int doorCount;
    Engine engine;
    static int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    void method(){
        System.out.println(Engine.countOfObject);
        Engine e = new Engine(200);
        System.out.println(e.horsePower);
    }

    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine{
        private int horsePower;
        static int countOfObject;

        public Engine(int horsePower) {
            //System.out.println(a);
            //System.out.println(doorCount);
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "My enqine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test{
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(256);
        System.out.println(engine);

        Car car = new Car("red", 2, engine);
        System.out.println(car);
    }
}
