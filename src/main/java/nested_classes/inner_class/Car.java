package nested_classes.inner_class;

/*
   в отличии от статик класса инер класс
   всегда завязан на внешнем классе,
   статик мы могли создать без обьекта внешнего класса
   инер же нужно создавать с обьектом внешнего

   inner класс может содержать только non-static
   элементы

   inner класс может обращаться даже к private
   элементам внешнего класса

   внешний класс может обращаться даже к private
   элементам inner класса, прежде создав его обьект
 */
public class Car {
    String color;
    int doorCount;
    Engine engine;


//    public Car(String color, int doorCount, int horsePower) {
//        this.color = color;
//        this.doorCount = doorCount;
//        this.engine = this.new Engine(horsePower);
//    }

    public Car(String color, int doorCount) {
        Engine e = new Engine(200);
        System.out.println(e.horsePower);
        this.color = color;
        this.doorCount = doorCount;
    }

    public void setEngine(Engine engine){
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

    public class Engine {
        private int horsePower;
        public final static int a = 5;

        public Engine(int horsePower) {
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

class Test {
    public static void main(String[] args) {
        // Car.Engine engine = new Car.Engine(256);

        //Car car = new Car("blask", 4, 300);
        //System.out.println(car);

        Car car = new Car("red", 4);
        Car.Engine engine = car.new Engine(150);
        car.setEngine(engine);
        System.out.println(car);
        //engine.a;

        //Car.Engine engine1 = new Car.Engine(150);

        Car.Engine engine2 = new Car("yellow",4).new Engine(200);
    }
}

