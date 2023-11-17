package work_with_files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex03TryWithResources {
    public static void main(String[] args) {
        String rubai = "Много лет размышлял я над жизнью земной.\n" +
                "Непонятного нет для меня под луной.\n" +
                "Мне известно, что мне ни чего не известно!\n" +
                "Вот последняя правда, откроется мной.\n";


        String s = "Privet";

        try (FileReader reader = new FileReader("test2.txt");
                FileWriter writer = new FileWriter("test2.txt", true)){
            writer.write(s);

            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
