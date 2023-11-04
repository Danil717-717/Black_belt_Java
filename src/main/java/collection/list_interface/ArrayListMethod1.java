package collection.list_interface;

import java.util.ArrayList;

public class ArrayListMethod1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add(1, "Mihail");
        System.out.println(arrayList1);
        for (String s:arrayList1) {
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.print(arrayList1.get(2)); //показ элемент на индексе
        System.out.println();

        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.print(arrayList1.get(i) + " ");
        }
        System.out.println();

        arrayList1.set(1,"Masha");
        System.out.println(arrayList1);

        arrayList1.remove(0);
        System.out.println(arrayList1);
    }
}
