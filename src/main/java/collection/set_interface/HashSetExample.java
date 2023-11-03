package collection.set_interface;

import java.util.HashSet;
import java.util.Set;

/*
  Set - множество
  Set - коллекция, хранящая уникальные элементы.
  Методы данной коллекции очень быстры.

  HashSet не запоминает порядок добавления элементов.
  В основе HashSet лежит HashMap. У элементов данного
  HashMap: ключи-это элементы HashMap, значения-это
  константа-заглушка
  Те при создании HashSet создается HashMap, но у HashMap
  ключ/значение, по этому у HashSet ключ/константа,
  которая не учитывается HashMap

  Так же как и HashMap  не может содержать дубликаты
  и может содержать null
 */
public class HashSetExample {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Zaur");
        set.add("Oleg");
        set.add("Marina");
        set.add("Igor");
        //set.add("Igor");

        System.out.println(set);
        System.out.println();
        for (String s :
                set) {
            System.out.println(s);
        }

        //.remove() - удаление
        set.remove("Zaur");

        //.isEmpty() - пустое ли множество
        System.out.println(set.isEmpty());
        System.out.println(set);

        //.contains() - проверка наличия элемента
        System.out.println( set.contains("Zaur"));

    }
}
