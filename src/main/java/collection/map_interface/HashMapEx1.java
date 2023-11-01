package collection.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {

    /*
    Элементами HashMap являются пары ключ/значение.
    HashMap не запоминает порядок добавления элементов.
    Его методы работают очень быстро.
    -
    Ключи элементов должны быть уникальными. Ключ может быть null.
    Значения могут повторяться, могут быть null.
    -
    если добавляем элемент с ключем который уже есть в Map, он перезаписывается
     */
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1000, "Zaur Tregubov");
        map1.put(3651, "Ivan Ivanon");
        map1.put(6879, "Mariay Sidorova");
        map1.put(78965, "Petr Petrov");
        map1.put(1000, "Petr Gazmznov");
        map1.put(null, "Sergey Petrov");
        map1.put(8697, null);

        //putIfAbsent - добавь если такого значения нет
        map1.putIfAbsent(1000,"romka");

        //get() - выведи значение по ключу
        //если будет указ ключ которого нет будет выведен null
        System.out.println(map1.get(1000));

        //remove() - удаляет значение по ключу
        map1.remove(8697);

        //containsValue() - выводит true  если есть такое значение
        // containsKey() - анологично с ключем
        System.out.println(map1.containsValue("Ivan Ivanov"));
        System.out.println(map1.containsKey(6879));

        //keySet - выводит множество имеющихся в HashMap ключей
        System.out.println(map1.keySet());
        //values() - анологично со значениями
        System.out.println(map1.values());

        //entrySet - позже

        System.out.println(map1);

        Map<String, String> map2 = new HashMap<>();
        map2.put("sdfg","sgfsg");
        map2.put("opoo","sdfosd");
        System.out.println(map2);
    }
}
