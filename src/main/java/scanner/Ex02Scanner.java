package scanner;

import java.util.Scanner;

public class Ex02Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Napishite paru strok");
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.next();
        System.out.println("Vi napisali v pervoy stroke: " + s1);
        System.out.println("Vi napisali vo vtoroy stroke: " + s2);
        System.out.println("Vi napisali vo vtoroy stroke: " + s3);
        scanner.close();
    }
}
