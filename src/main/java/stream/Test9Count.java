package stream;

import java.util.stream.Stream;

public class Test9Count {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,1,5,1,2,30,3,5);


        //System.out.println(stream1.count());
        //stream после обработки нельзя использовать!
        System.out.println(stream1.distinct().count());

    }
}
