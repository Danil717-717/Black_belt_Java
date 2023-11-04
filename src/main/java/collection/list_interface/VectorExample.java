package collection.list_interface;

import java.util.Vector;

public class VectorExample {
    /*
    Vector - устаревший synchronized класс. В своей основе
    содержит массив элементов Object. Не рекомендуется к использованию
     */
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Zaur");
        vector.add("Mihail");
        vector.add("Oleg");
        vector.add("Katya");
        System.out.println(vector);

        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        vector.remove(2);
        System.out.println(vector);

        System.out.println(vector.get(1));

    }
}
