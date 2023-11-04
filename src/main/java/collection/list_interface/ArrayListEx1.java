package collection.list_interface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {

        /*
        Arraylist - массив, который может менять свою длину

        Arraylist имеет строение как у массива, добавление элемента
        в тело списка будет приводить к множеству операций, сдвига всех
        элементов которые справа,так же и удаление, а поиск проходит мгновенно

         */
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>(300);
        arrayList2.add("sdg");
        arrayList2.add("adv");

        List<String> arrayList3 = new ArrayList<>();

        ArrayList<String> arrayList4 = new ArrayList<>(arrayList1);
        System.out.println(arrayList1);
        System.out.println(arrayList4);

        System.out.println(arrayList1==arrayList4);//false
    }
}
