package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");

        Iterator<String> iterator = arrayList1.iterator();  //вывод ArrayList с помощью итератора
        while (iterator.hasNext()){              // проверили есть ли элемент далее
            System.out.println(iterator.next()); // получили его и выводим
        }

        //в отличие от форич мы можем взаимодействовать с элементами
        // например удалить
        Iterator<String> iterator1 = arrayList1.iterator();
        while (iterator1.hasNext()){ //проверили есть ли далее элемент
            iterator1.next();       // получили его
            iterator1.remove();     // удалили
        }
        System.out.println(arrayList1);
    }
}
