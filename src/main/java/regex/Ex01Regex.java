package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex01Regex {
    public static void main(String[] args) {
        String s = "Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, Flat 48," +
                "email: ivanov@mail.ru, Postcode: AA99, Phone Nomber: +123456789;" +
                "Petrova Maria, Ukraine, Kiev, Lomonosov street, 33, Flat 18, " +
                " email: masha@yandex.ru, Postcode: UKR54, Phone Nomber: +987654321;" +
                "Chuck Norris, USA, Hollywood, All stars street, 87, Flat 21, " +
                " email: chack@gmail.com, Postcode: USA23, Phone Nomber: +136478952;";

        //все кроме знаков и пробелов
        //Pattern pattern = Pattern.compile("\\w+");

        // теперь нужно найти номер дома,
        // это число из 2 цифр         \граница\2 цифры\граница
        //Pattern pattern = Pattern.compile("\\b\\d{2}\\b");

        // найти номер телефона
        //Pattern pattern = Pattern.compile("\\+\\d{9}");

        //email
        Pattern pattern = Pattern.compile("\\w+@\\w+\\.(ru|com)");




        Matcher matcher = pattern.matcher(s);

        while (matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
