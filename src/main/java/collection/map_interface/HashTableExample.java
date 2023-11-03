package collection.map_interface;

/*
HashTable устаревший класс, который работает по тем же принципам,
что и HashMap.
В отличие от HashMap является synchronized. По этой причине
его методы далеко не такие быстрые.

В HashTable ни ключ не значение не может быть null

Даже если нужна поддержка многопоточности не следует
использовать HashTable, следует использовать
    ConcurrentHashMap
 */

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Double,Student> ht = new Hashtable<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        Student st4 = new Student("Vasiliy", "Smirnov", 1);
        Student st5 = new Student("Sasha", "Ogurcov", 2);
        Student st6 = new Student("Elena", "Petrova", 4);
        Student st7 = new Student("Igor", "Sidorov", 3);

        ht.put(5.8,st1);
        ht.put(9.1,st7);
        ht.put(6.4,st2);
        ht.put(7.5,st4);
        ht.put(7.2,st3);
        //ht.put(null,st3);

        System.out.println(ht);
    }


}
