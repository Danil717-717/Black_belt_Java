package work_with_files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Ex02FileReader {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        try {
            reader = new FileReader("test2.txt");
            int character;
            // в character записывается reader и он
            //будет читаться пока не будет равен -1, те конец
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();      // разграничение строк
            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            reader.close();
        }
    }
}
