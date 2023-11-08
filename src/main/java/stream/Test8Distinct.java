package stream;

import java.util.stream.Stream;

public class Test8Distinct {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,1,5,1,2,30,3,5);


        stream1.distinct().forEach(System.out::println);

    }
}
