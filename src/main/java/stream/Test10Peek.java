package stream;

import java.util.stream.Stream;

public class Test10Peek {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,1,5,1,2,30,3,5);

        System.out.println(stream1.distinct().peek(System.out::println).count());
        /*
          вывод
            1
            2
            3
            4
            5
            30 вывод peek
            6  дальше метод count
         */


    }
}
