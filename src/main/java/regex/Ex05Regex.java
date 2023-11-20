package regex;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex05Regex {
    public static void main(String[] args) {
        String myString = "11234567891011121325898;"
                + "98765432165498750921654;" +
                "86274193658741230826897";
        // нужно из этого числа выделить дату и
        // перенести ее в начало, а потом разделить
        // по шаблону
        // 12/25 1123 4567 8910 1112 13/25 (898) card

        // помещаем наше число в группы
        Pattern pattern = Pattern.compile("(\\d{4})" +
                "(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");

        Matcher matcher = pattern.matcher(myString);

        // меняем выделенные группы местами
        // номера групп от 1 с лево направо
        // $1 - первая группа
//        String myString2 = matcher.replaceAll(
//                "$5/$6 $1 $2 $3 $4 ($7)");
//        System.out.println(myString2);

        //можно вывести только нужную группу
        // например CVV код это 7 группа
        while (matcher.find()){
            System.out.println(matcher.group(7));
        }

    }
}
