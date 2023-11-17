package work_with_files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Ex13PathAndFiles {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        //Создадим файл и запишем в него текст
//        Files.createFile(filePath);
//        String dialog = "-Privet\n-Privet\n-Kak dela?\n-Otlichno! Kak u tebya?\n" +
//                "-A u menya ogon!)";
//
//        Files.write(filePath, dialog.getBytes());

        //Прочитаем из файла
        List<String> list =  Files.readAllLines(filePath);
        for (String i: list){
            System.out.println(i);
        }



    }
}
