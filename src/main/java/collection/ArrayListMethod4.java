package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethod4 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");

        StringBuilder [] array = {sb1, sb2, sb3, sb4};

        List<StringBuilder> list = Arrays.asList(array);
        // asList связывает массив и лист, все изменения массива
        // отражаются на листе
        System.out.println(list);

        array[1].append("!!!");
        array[0] = new StringBuilder("F");
        System.out.println(list);
    }

}
