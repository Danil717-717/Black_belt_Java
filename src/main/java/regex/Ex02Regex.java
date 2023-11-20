package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex02Regex {
    public static void main(String[] args) {
        String s1 = "ABCD ABCE ABCF ABCGABCH";
        // эти 2 класса помогают
        // в Pattern шаблон, передается правило поиска
        // Matcher находит соответствие, сверка
        Pattern pattern1 = Pattern.compile("ABC");
        Matcher matcher = pattern1.matcher(s1);

        // если есть совпадение вернет true
        while (matcher.find()){
            // если есть совпадение выводит
            System.out.println("Position: " + matcher.start() +
                    "   " + matcher.group());
        }


        System.out.println();

        String s2 = "OPABMNCD";
        Pattern pattern2 = Pattern.compile("[ABC]");
        Matcher matcher2 = pattern2.matcher(s2);

        while (matcher2.find()){
            System.out.println("Position: " + matcher2.start() +
                    "   " + matcher2.group());
        }

        System.out.println();

        String s3 = "ABDOP";
        Pattern pattern3 = Pattern.compile("AB[C-F]OP");
        Matcher matcher3 = pattern3.matcher(s3);

        while (matcher3.find()){
            System.out.println("Position: " + matcher3.start() +
                    "   " + matcher3.group());
        }

        System.out.println();

        String s4 = "abcd abce abc5abcg6abch";
        Pattern pattern4 = Pattern.compile("abc[e-g4-7]");
        Matcher matcher4 = pattern4.matcher(s4);

        while (matcher4.find()){
            System.out.println("Position: " + matcher4.start() +
                    "   " + matcher4.group());
        }

        System.out.println();

        String s5 = "abcd abce abc5abcg6abch";
        Pattern pattern5 = Pattern.compile("abc[^e-g4-7]");
        Matcher matcher5 = pattern5.matcher(s5);

        while (matcher5.find()){
            System.out.println("Position: " + matcher5.start() +
                    "   " + matcher5.group());
        }

        System.out.println();

        String s6 = "abcd abce abc5abcg6abch";
        Pattern pattern6 = Pattern.compile("abc(e|5)");
        Matcher matcher6 = pattern6.matcher(s6);

        while (matcher6.find()){
            System.out.println("Position: " + matcher6.start() +
                    "   " + matcher6.group());
        }

        System.out.println();
        //. любой символ
        String s7 = "abcd abce abc5abcg6abch";
        Pattern pattern7 = Pattern.compile("abc.");
        Matcher matcher7 = pattern7.matcher(s7);

        while (matcher7.find()){
            System.out.println("Position: " + matcher7.start() +
                    "   " + matcher7.group());
        }

        System.out.println();
        //^ - начало строки
        String s8 = "abcd abce abc5abcg6abch";
        Pattern pattern8 = Pattern.compile("^abc");
        Matcher matcher8 = pattern8.matcher(s8);

        while (matcher8.find()){
            System.out.println("Position: " + matcher8.start() +
                    "   " + matcher8.group());
        }

        System.out.println();
        //$ - конец строки
        String s9 = "abcd abce abc5abcg6abch";
        Pattern pattern9 = Pattern.compile("abch$");
        Matcher matcher9 = pattern9.matcher(s9);

        while (matcher9.find()){
            System.out.println("Position: " + matcher9.start() +
                    "   " + matcher9.group());
        }

        System.out.println();
        //[0-9] \d - найти цифру
        String s10 = "abcd abce abc5abcg16abch";
        //Pattern pattern10 = Pattern.compile("[0-9]");
        Pattern pattern10 = Pattern.compile("\\d");
        Matcher matcher10 = pattern10.matcher(s10);

        while (matcher10.find()){
            System.out.println("Position: " + matcher10.start() +
                    "   " + matcher10.group());
        }

        System.out.println();
        // \D - найти не цифру
        String s11 = "abcd abce abc5abcg16abch";
        Pattern pattern11 = Pattern.compile("\\D");
        Matcher matcher11 = pattern11.matcher(s11);

        while (matcher11.find()){
            System.out.println("Position: " + matcher11.start() +
                    "   " + matcher11.group());
        }

        System.out.println();
        // \w - найти букву цифру символ без пробела
        String s12 = "abcd abce abc5abcg16abch";
        Pattern pattern12 = Pattern.compile("\\w");
        Matcher matcher12 = pattern12.matcher(s12);

        while (matcher12.find()){
            System.out.println("Position: " + matcher12.start() +
                    "   " + matcher12.group());
        }

        System.out.println();
        // \W - найти символы кроме букв цифр символов
        // c пробелами
        String s13 = "abcd% abce= abc5+abcg16abch";
        Pattern pattern13 = Pattern.compile("\\W");
        Matcher matcher13 = pattern13.matcher(s13);

        while (matcher13.find()){
            System.out.println("Position: " + matcher13.start() +
                    "   " + matcher13.group());
        }

        System.out.println();
        // + - вхождение повторяющихся символов
        String s14 = "abcd abce abc5abcg16abch";
        Pattern pattern14 = Pattern.compile("\\w+");
        Matcher matcher14 = pattern14.matcher(s14);

        while (matcher14.find()){
            System.out.println("Position: " + matcher14.start() +
                    "   " + matcher14.group());
        }


        System.out.println();
        // {n} - {4} слова длинна которых равна 4
        String s15 = " poka abc Zaur dom kino";
        Pattern pattern15 = Pattern.compile("\\w{4}");
        Matcher matcher15 = pattern15.matcher(s15);

        while (matcher15.find()){
            System.out.println("Position: " + matcher15.start() +
                    "   " + matcher15.group());
        }

        System.out.println();
        // \s
        String s16 = " poka    abc       Zaur   dom kino";
        Pattern pattern16 = Pattern.compile("\\w\\s+\\w");
        Matcher matcher16 = pattern16.matcher(s16);

        while (matcher16.find()){
            System.out.println("Position: " + matcher16.start() +
                    "   " + matcher16.group());
        }

        System.out.println();
        // {2, 6}- {min,max}- минимум 2 символа максимум 6, max можно
        // не указывать {2,}
        String s17 = " poka abcce3 Zaur78  dom kino9a!!!!!!!!!!!!!";
        Pattern pattern17 = Pattern.compile("\\D{2,6}");
        Matcher matcher17 = pattern17.matcher(s17);

        while (matcher17.find()){
            System.out.println("Position: " + matcher17.start() +
                    "   " + matcher17.group());
        }

        System.out.println();
        // {2, 6}- {min,max}- минимум 2 символа максимум 6, max можно
        // не указывать {2,}
        String s18 = "ABCABABDA";
        Pattern pattern18 = Pattern.compile("(AB){2,3}");
        Matcher matcher18= pattern18.matcher(s18);

        while (matcher18.find()){
            System.out.println("Position: " + matcher18.start() +
                    "   " + matcher18.group());
        }

        System.out.println();
        // {2, 6}- {min,max}- минимум 2 символа максимум 6, max можно
        // не указывать {2,}
        String s19 = "DABCDABABDABABABAABD";
        Pattern pattern19 = Pattern.compile("D(AB){2,}");
        Matcher matcher19= pattern19.matcher(s19);

        while (matcher19.find()){
            System.out.println("Position: " + matcher19.start() +
                    "   " + matcher19.group());
        }

        System.out.println();
        // \\A
        String s20 = "abcd abce abc5abcg16abch";
        Pattern pattern20 = Pattern.compile("\\Aabc");
        Matcher matcher20 = pattern20.matcher(s20);

        while (matcher20.find()){
            System.out.println("Position: " + matcher20.start() +
                    "   " + matcher20.group());
        }

        System.out.println();
        // \\Z
        String s21 = "abcd abce abc5abcg16abch";
        Pattern pattern21 = Pattern.compile("bch\\Z");
        Matcher matcher21 = pattern21.matcher(s21);

        while (matcher21.find()){
            System.out.println("Position: " + matcher21.start() +
                    "   " + matcher21.group());
        }

        System.out.println();
        // варианты сложения с одной скобки и со 2 скобки
        String s22 = "abcd abce abc5abcg16abch";
        Pattern pattern22 = Pattern.compile("[abcd][efgh3-8]");
        Matcher matcher22 = pattern22.matcher(s22);

        while (matcher22.find()){
            System.out.println("Position: " + matcher22.start() +
                    "   " + matcher22.group());
        }




    }
}
