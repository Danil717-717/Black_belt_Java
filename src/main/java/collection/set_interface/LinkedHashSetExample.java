package collection.set_interface;

/*
  LinkedHasSet является наследником HasSet. Хранит информацию
  о порядке добавления элементов.
  Производительность методов немного ниже, чем у методов HasSet.
  В основе LinkedHasSet лежит HashMap. У элементов данного HashMap
  ключи - это элементы LinkedHasSet, значения - это константа-заглушка.

  если нужен HasSet который запоминает порядок добавления
 */

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(5);
        lhs.add(3);
        lhs.add(1);
        lhs.add(8);
        lhs.add(10);

        System.out.println(lhs);
    }

}
