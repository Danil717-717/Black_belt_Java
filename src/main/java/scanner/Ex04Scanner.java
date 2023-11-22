package scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilterReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ex04Scanner {
    public static void main(String[] args) {
        Scanner scanner = null;
        Set<String> set = new TreeSet<>();
        try {
            scanner = new Scanner(new FileReader(
                    new File("./src/main/java/scanner/TestFile.txt")));
            //уберет знаки препинания и символы
            scanner.useDelimiter("\\W");
            while (scanner.hasNext()){
                String word = scanner.next();
                set.add(word);
            }
            for (String word:set){
                System.out.println(word);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {
            scanner.close();
        }
    }
}
