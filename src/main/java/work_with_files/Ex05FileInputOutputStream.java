package work_with_files;

import java.io.*;

public class Ex05FileInputOutputStream {
    /*
    копирование картинки
    так же можно использовать
    BufferedInputStream
    BufferedOutputStream
     */
    public static void main(String[] args) {
        try (FileInputStream inputStream =
                     new FileInputStream("C:\\Users\\start\\OneDrive\\Рабочий стол\\java.jpg");
             FileOutputStream outputStream =
                     new FileOutputStream("./src/main/java/work_with_files/java.jpg")) {

            int character;
            while ((character=inputStream.read())!=-1){
                outputStream.write(character);
            }

            System.out.println("Done!");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
