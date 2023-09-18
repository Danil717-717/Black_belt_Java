package generics;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        //Type Safe & Reusable Code
        List <String> list= new ArrayList<>();//<>Даймон
//        list.add("OK");
//        list.add(5);
//        list.add(new StringBuilder("ekafm"));
//        list.add(new Car());
        list.add("privet");
        list.add("pokA");
        list.add("ok");
        list.add("jksdis");



        for (Object o:list) {
            System.out.println(o + " dlina " + ((String)o).length());
        }
    }
}

class Car{}
