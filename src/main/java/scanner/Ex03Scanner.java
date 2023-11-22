package scanner;

import java.util.Scanner;

public class Ex03Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("Privet\nKak dela?" +
                "\nChto otlichnogo");
//        String s = scanner.nextLine();
//        System.out.println(s);
//        System.out.println(scanner.nextLine());
//        System.out.println(scanner.nextLine());

        //пока есть строка выводи ее
//        while (scanner.hasNextLine()){
//            System.out.println(scanner.nextLine());
//        }

        //прочитать 3 символ
        System.out.println(scanner.next().charAt(2));

        scanner.close();
    }
}
