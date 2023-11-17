package work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ex07RandomAccessFile {
    public static void main(String[] args) {
        try(RandomAccessFile file =
                new RandomAccessFile("./src/main/java/work_with_files/Test3.txt","rw")) {



            int a = file.read(); //курсор в начале файла
            System.out.println((char) a);
            int b = file.read(); //курсор на сл элементе файла
            System.out.println((char) b);
            //так проходит передвижение курсора по байтово

            //можно прочитать сразу строчку
            String s1 = file.readLine();
            System.out.println(s1);

            // если нужно читать или писать с какого-то места
            file.seek(25);
            String s2 = file.readLine();
            System.out.println(s2);

            //узнать, где находится курсор
            long position = file.getFilePointer();
            System.out.println(position);

            // если дозаписать файл с какой-то позиции
            // например String выбираем байтs
            // Важно так перезаписывается!!!
            file.seek(0);
            file.writeBytes("Stixi");

            //конец файла добавить
            file.seek(file.length()-1);
            file.writeBytes(" \n\t\t\t\t\t\t name avtor");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
