package collection.set_interface;

import java.util.HashSet;

public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();

        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(5);
        hashSet1.add(1);
        hashSet1.add(8);
        System.out.println(hashSet1);

        HashSet<Integer> hashSet2 = new HashSet<>();

        hashSet2.add(7);
        hashSet2.add(4);
        hashSet2.add(5);
        hashSet2.add(3);
        hashSet2.add(8);
        System.out.println(hashSet2);

        //обьединение 2 множеств
        HashSet<Integer> unionSet = new HashSet<>(hashSet1);
        unionSet.addAll(hashSet2);
        System.out.println(unionSet);

        //показать только одинаковые элементы множеств
        HashSet<Integer> intersectSet = new HashSet<>(hashSet1);
        intersectSet.retainAll(hashSet2);
        System.out.println(intersectSet);

        // показать разность множеств
        // те из 1 множества вычитаем элементы второго множества,
        // 2 множество и одинаковые элементы со 2 множеством
        HashSet<Integer> subtractSet = new HashSet<>(hashSet1);
        subtractSet.removeAll(hashSet2);
        System.out.println(subtractSet);



    }
}
