package collection.set_interface;

/*
  TreeSet хранит элементы в отсортированном по возрастанию порядке.
  В основе TreeSet лежит TreeMap. У элементов данного TreeMap:
  ключи - это элементы TreeSet, значения - это константа-заглушка.

  Так же не может содержать null
 */

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(8);
        //treeSet.add(null);

        System.out.println(treeSet);

        treeSet.remove(3);
        System.out.println(treeSet);

        System.out.println(treeSet.contains(5));
    }

}
