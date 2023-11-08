package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test1Map {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela?");
        list.add("ok");
        list.add("poka");
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            list.set(i, String.valueOf(list.get(i).length()));
        }
        /*
        for-ом мы вывели длинны элементов
        нашего листа
         */
        System.out.println("for: " + list);


        List<String> list2 = new ArrayList<>();
        list2.add("privet");
        list2.add("kak dela?");
        list2.add("ok");
        list2.add("poka");
        /*
         Можем сделать так же при помощи stream.
         Stream не меняет исходный List.
         Метод .map() - берет каждый элемент по очереди
         из нашего stream и сопоставляет ему элемент,
         который получается после применения на нем,
         тех действий, которые мы прописываем в нем
         с помощью lambda выражения
         */
        System.out.println(list2.stream().map(element -> element.length()).collect(Collectors.toList()));
        ;
        // теперь у нас новый stream, который
        // вместо "privet",...,"poka"
        // содержит 6 9 2 4
        // с помощью метода .collect(Collectors.toList())
        // можем его преобразовать в List
        List<Integer> list3 = list2.stream().map(element -> element.length())
                .collect(Collectors.toList());
        System.out.println("Stream list3: " + list3);

        //stream в массиве
        int[] arr = {5, 9, 3, 8, 1};
        // 5, 3, 1, 8 , 1
        arr =  Arrays.stream(arr).map(element -> {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray();
        System.out.println(Arrays.toString(arr));
        System.out.println("---");

        //set
        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("kak dela?");
        set.add("ok");
        set.add("poka");
        System.out.println(set);
        //  6 9 2 4

        Set<Integer> set2 = set.stream().map(el->el.length()).collect(Collectors.toSet());
        List<Integer> list4 = set.stream().map(el->el.length()).collect(Collectors.toList());
        System.out.println("Set:  " + set2);
        System.out.println("List: " + list4);

    }
}
