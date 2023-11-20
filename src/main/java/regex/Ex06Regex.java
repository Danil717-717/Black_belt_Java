package regex;

import java.util.regex.Pattern;

public class Ex06Regex {

    void chekIP(String ip){
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}" +
                "(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";

        // 25[0-5]   |   2[0-4]\d   |   [01]?\d?\d             (\.)
        // 250-255       200-249      0или1?   0-9?  0-199
        //                            может быть
        //                            может не быть

        System.out.println(ip + " is OK? " + Pattern.matches(regex,ip));
    }
    public static void main(String[] args) {
        //проверка подлинности ip
        // если похоже на 0-255,0-255,0-255,0-255
        // то корректно

        String ip1 = "255.38.192.99";
        String ip2 = "255.262.92.05";

        Ex06Regex regex6 = new Ex06Regex();
        regex6.chekIP(ip1);
        regex6.chekIP(ip2);


    }
}
