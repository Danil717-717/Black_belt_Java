package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test4Reduce {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        int res = list.stream().reduce((accumulator, el) ->
                accumulator * el).get(); //без get() не работает тк Optional<>
        //5, 8, 2, 4, 3
        //accumulator = 5  40  80  320  960
        //element =     8   2   4    3
        System.out.println("res v1: " + res);


        //v2
        int res2 = list.stream().reduce(1, (accumulator, el) ->
                accumulator * el);

        //5, 8, 2, 4, 3
        //accumulator = 1  5  40  80  320  960
        //element =     5  8   2   4    3
        System.out.println("res v2: " + res2);


        List<Integer> list100 = new ArrayList<>();
        //int res100 = list100.stream().reduce((accumulator, el)->
        //        accumulator*el).get(); //вернет NoSuchElementException
        //System.out.println(res100);


        List<String> list3 = new ArrayList<>();
        list3.add("privet");
        list3.add("kak dela?");
        list3.add("ok");
        list3.add("poka");

        String res3 = list3.stream().reduce((acum, el) ->
                acum + " " + el).get();
        System.out.println(res3);


        //поэтому
        Optional<Integer> optionalI = list100.stream().reduce((accumulator, el) ->
                accumulator * el);
        if (optionalI.isPresent()) {
            System.out.println(optionalI.get());
        } else {
            System.out.println("Not present");
        }

    }
}
