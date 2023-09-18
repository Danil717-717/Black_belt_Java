package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WildCards {
    public static void main(String[] args) {
        //    List<Number> list1 = new ArrayList<Integer>();
        //    List<Objects> list1 = new ArrayList<Integer>();
        List<?> list1 = new ArrayList<String>();
        //list1.add("hello");

        //bounded wildcards - ограничивать сверху или снизу
        List<? extends Number> list5 = new ArrayList<Integer>();
        List<? super Integer> list6 = new ArrayList<Number>();

        List<Double> list2 = new ArrayList<>();
        list2.add(3.14);
        list2.add(3.15);
        list2.add(3.16);
        showListInfo(list2);

        List<String> list3 = new ArrayList<>();
        list3.add("ok");
        list3.add("privet");
        list3.add("poka");
        showListInfo(list3);


        ArrayList<Double> ald = new ArrayList<>();
        ald.add(3.14);
        ald.add(3.15);
        ald.add(3.16);
        System.out.println(summ(ald));

        ArrayList<Integer> ali = new ArrayList<>();
        ali.add(3);
        ali.add(35);
        ali.add(36);
        System.out.println(summ(ali));

        ArrayList<String> als = new ArrayList<>();
        //System.out.println(summ(als));
    }

    static void showListInfo(List<?> list){
        System.out.println(" list sodergit: " + list);
    }

    public static  double summ(ArrayList<? extends Number> al ){
        double summ = 0;
        for (Number n : al) {
            summ += n.doubleValue();
        }
        return summ;
    }
}
