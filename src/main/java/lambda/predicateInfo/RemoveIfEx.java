package lambda.predicateInfo;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIfEx {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Privet");
        al.add("Poka");
        al.add("Ok");
        al.add("Uchim Java");
        al.add("Imenno lambdas");

        al.removeIf(element-> element.length()<5);
        System.out.println(al);

        //через переменную
        Predicate<String> predicate = element-> element.length()<5;
        al.removeIf(predicate);
        System.out.println(al);

    }
}
