package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayListMethod5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Ivan");
        arrayList2.add("Mariya");
        arrayList2.add("Igor");


        //removeAll(Collection<?> c) -> boolean
        //arrayList1.removeAll(arrayList2);
        //System.out.println(arrayList1);
        //удаляет элементы арейлиста в параметре из арейлиста метода


        //retainAll(Collection<?> c) -> boolean
        //arrayList1.retainAll(arrayList2);
        //System.out.println(arrayList1);
        // наоборот оставляет элементы аррейлиста в параметре в арейлисте метода


        //containsAll(Collection <?> c) -> boolean
        //boolean result = arrayList1.containsAll(arrayList2);
        //System.out.println(result);
        // проверяет, содержит ли наш аррейлист все элементы из арейлиста в параметре
        // false - "Игоря" нет


        //subList(int fromIndex, int toIndex)-> List<E>
        //создает из имеющегося ArrayList-a SubList,его отрывок
        //возвращает List
        //List<String> myList = arrayList1.subList(1,4); //4 элемент не включается
        //System.out.println(myList);
        //этот List не существует,связан с ArrayList, это передставление ArrayList
        //после представления SubList модификации с ArrayList не возможны
        //нужно их делать с List, будет Exception


        //toArray() -> Object[]
        //Object[] array = arrayList1.toArray();

        //toArray(T [] a) -> T[]
//        String[] array = arrayList1.toArray(new String[5]);//[0] чаще всего пишут так, Java сама создает массив нужного размера
//        for (String s :array ) {
//            System.out.println(s);
//        }


        //List.of(E ... elements) -> List<E>
        //List.copyOf(Collection<E> c) -> List<E>
        //создаются List-ы которые не возможно изменить
        List<Integer> list1 = List.of(3, 8, 13);
        System.out.println(list1);
        //list1.add(100);
        //быстро создали лист, но модифицировать его нельзя! и добавить Null!!!
        List<String> list2 = List.copyOf(arrayList1);
        System.out.println(list2);

    }
}