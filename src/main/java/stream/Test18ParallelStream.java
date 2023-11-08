package stream;

import java.util.ArrayList;
import java.util.List;

public class Test18ParallelStream {
    /*
        например если нужно умножить числа от 1 до 1000000000
        проц начинает с 1 умнож на 2 умнож на 3 и так до конца
        Если процессоров несколько, то можно их задействовать
        в вычислении, например

        1 проц умнож от 1 до 250_000000
        2 проц от 250_000001 до 500_000000
        3 прой от 500_000001 до 750_000000
        4 проц от 750_000001 до 1000000000
        потом результат перемножаются

        и это не многопоточность
     */

    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);


        double res = list.stream().reduce((ac,el)-> ac+el).get();
        double res1 = list.parallelStream().reduce((ac,el)-> ac+el).get();
        System.out.println(res);
        System.out.println(res1);

        // может привести к некорректным вычислениям
        double res2 = list.stream().reduce((ac,el)-> ac/el).get();
        double res3 = list.parallelStream().reduce((ac,el)-> ac/el).get();
        System.out.println(res2);
        System.out.println(res3);
    }



}
