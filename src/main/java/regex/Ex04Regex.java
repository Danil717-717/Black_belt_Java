package regex;

public class Ex04Regex {
    //замена чего-то в нашем String
    public static void main(String[] args) {
        String s1 = "Privet,     moy   drug!   Kak  idet izuchenue Java    ?";


        System.out.println(s1);
        //  замена Java на SQL
        //s1 = s1.replace("Java", "SQL");

        // замена все в строке что соответствует
        // пробелом от 2 шт до бесконечн на 1 пробел
        //s1 = s1.replaceAll(" {2,}", " ");

        //замена с начало слова i после i любое кол-во симв
        //на 4444
        //s1 = s1.replaceAll("\\bi\\w+", "4444");

        //замена первое совпадение с с начало слова i после
        // i любое кол-во симв на 4444
        s1 = s1.replaceFirst("\\bi\\w+", "4444");


        System.out.println(s1);
    }

}
