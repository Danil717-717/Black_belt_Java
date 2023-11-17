package work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class Ex01FileWriter {
    public static void main(String[] args) throws IOException {
        String rubai = "Много лет размышлял я над жизнью земной.\n" +
                "Непонятного нет для меня под луной.\n" +
                "Мне известно, что мне ни чего не известно!\n" +
                "Вот последняя правда, откроется мной.\n";


        String s = "Privet";
        /*
        v1
        Создаем файл на рабочем столе, передаем в наш
        writer полный путь к файлу и далее посимвольно
        передаем через метод .write нашу строку
         */
        FileWriter writer = null;
        try {
            writer = new FileWriter("C:\\Users\\start\\OneDrive\\Рабочий стол\\Test1.txt");
            for (int i = 0; i<rubai.length();i++){
                writer.write(rubai.charAt(i));
            }
            System.out.println("Done");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            writer.close();
            //если не закрыть поток в файл ничего не запишется
        }

        //v2
        // относительный путь в корне проекта

        FileWriter writer2 = null;
        try {
            writer2 = new FileWriter("Test2.txt");
            for (int i = 0; i<rubai.length();i++){
                writer2.write(rubai.charAt(i));
            }
            System.out.println("Done!!!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            writer2.close();
            //если не закрыть поток в файл ничего не запишется
        }


        //v3
        // относительный путь в корне проекта
        // append - true -если нужно не перезаписывать
        // файл, а добавлять в конец

        FileWriter writer3 = null;
        try {
            writer3 = new FileWriter("./src/main/java/work_with_files/Test3.txt", true);
            //writer3.write(rubai);
            writer3.write("\n" + rubai);
            System.out.println("Done!!!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            writer3.close();
            //если не закрыть поток в файл ничего не запишется
        }



    }
}
