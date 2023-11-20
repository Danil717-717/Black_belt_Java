package regex;

import java.util.Arrays;

public class Ex03Regex {
    public static void main(String[] args) {
        String s = "Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, Flat 48," +
                "email: ivanov@mail.ru, Postcode: AA99, Phone Nomber: +123456789;" +
                "Petrova Maria, Ukraine, Kiev, Lomonosov street, 33, Flat 18, " +
                " email: masha@yandex.ru, Postcode: UKR54, Phone Nomber: +987654321;" +
                "Chuck Norris, USA, Hollywood, All stars street, 87, Flat 21, " +
                " email: chack@gmail.com, Postcode: USA23, Phone Nomber: +136478952;";


        String s2 = "chack@gmail.com";
        //подтвердить 1 соответствие с шаблоном
        boolean res = s2.matches("\\w+@\\w+.(com|ru)");
        System.out.println(res);

        String [] arr =  s.split(" ");
        System.out.println(Arrays.toString(arr));






    }
}
