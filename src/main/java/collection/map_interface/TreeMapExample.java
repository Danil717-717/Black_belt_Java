package collection.map_interface;

/*
- Элементами TreeMap являются пары ключ/значение.
В TreeMap элементы храняться в отсортированном по
 возрастанию порядке

 В основе TreeMap лежит красно черное дерево. Это
 позволяет методам работать быстро, но не быстрее,
 чем методы HashMap

 Не может содержать null
 */

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        Student st4 = new Student("Vasiliy", "Smirnov", 1);
        Student st5 = new Student("Sasha", "Ogurcov", 2);
        Student st6 = new Student("Elena", "Petrova", 4);
        Student st7 = new Student("Igor", "Sidorov", 3);

        treeMap.put(5.8,st1);
        treeMap.put(9.1,st7);
        treeMap.put(6.4,st2);
        treeMap.put(7.5,st4);
        treeMap.put(7.2,st3);
        treeMap.put(8.2,st6);
        treeMap.put(7.9,st5);
        //treeMap.put(null,st5);

        //Student имплементирует Comparable и по этому может быть
        // ключем, мы определили как сравнивать студентов
        TreeMap<Student, Double> treeMap1 = new TreeMap<>();
        treeMap1.put(st1, 4.6);
        treeMap1.put(st7, 5.6);
        treeMap1.put(st3, 5.8);


        // или реализовать так со встроенным компоратором
        TreeMap<Student, Double> treeMap2 = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0; //o1.name.compareTo(o2.name);
            }
        });

        System.out.println(treeMap);

        //.get() - показать
        System.out.println(treeMap.get(6.4));

        //.remove() - удалить
        treeMap.remove(5.8);
        System.out.println(treeMap);

        //.descendingMap()   - перевернуть
        System.out.println(treeMap.descendingMap());

        //.tailMap()  - вывести все больше чем указано
        System.out.println(treeMap.tailMap(7.3));

        //.lastEntry() - вывести последний элемент
        System.out.println(treeMap.lastEntry());

        //.firstEntry() - вывести первый элемент
        System.out.println(treeMap.firstEntry());
    }
}

