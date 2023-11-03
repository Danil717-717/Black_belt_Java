package collection.map_interface;

/*
 Является наследником HashMap. Хранит информацию
 о порядке добавления элементов или порядке их
 использования. Производительность методов
  немного ниже, чем у HashMap
 */

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        LinkedHashMap<Double,Student> linkedHashMap = new LinkedHashMap<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        Student st4 = new Student("Vasiliy", "Smirnov", 1);
        Student st5 = new Student("Sasha", "Ogurcov", 2);
        Student st6 = new Student("Elena", "Petrova", 4);
        Student st7 = new Student("Igor", "Sidorov", 3);

        linkedHashMap.put(5.8,st1);
        linkedHashMap.put(9.1,st7);
        linkedHashMap.put(6.4,st2);
        linkedHashMap.put(7.5,st4);
        linkedHashMap.put(7.2,st3);
        linkedHashMap.put(8.2,st6);
        linkedHashMap.put(7.9,st5);

        System.out.println(linkedHashMap);

        LinkedHashMap<Double,Student> linkedHashMap1 = new LinkedHashMap<>(
                16,0.75f,true);
                   //0.75 - золотая середина между скоростью и размером
                   // false - не изменяется порядок при использование элементов
                   // true - меняется общий порядок элементов при использовании

        linkedHashMap1.put(7.2,st3);
        linkedHashMap1.put(8.2,st6);
        linkedHashMap1.put(7.9,st5);
        System.out.println(linkedHashMap1);

        System.out.println(linkedHashMap1.get(7.9)); // предпоследний
        System.out.println(linkedHashMap1.get(7.2)); // последний
        //мы использовали этот элемент, теперь он будет последний
        System.out.println(linkedHashMap1);
    }
}
