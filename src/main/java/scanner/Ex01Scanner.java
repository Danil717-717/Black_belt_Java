package scanner;

import java.util.Scanner;

public class Ex01Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvod chisla: ");
        int i = scanner.nextInt();
        System.out.println("chislo: " + i);

        System.out.println("---");
        System.out.println("VVedite chisla");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        double d = scanner.nextDouble();
        System.out.println("Chastnoe: " + x/y);
        System.out.println("Ostatok: " + x%y);
        System.out.println("drobnoe: " + d);
        scanner.close();
    }
}
