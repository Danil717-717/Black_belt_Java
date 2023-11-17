package work_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Ex12PathAndFiles {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\start\\OneDrive\\Рабочий стол\\K");
        Path directoryMPath = Paths.get("C:\\Users\\start\\OneDrive\\Рабочий стол\\M");


        //копируем файл в папку, но там должен быть указан путь
        //Files.copy(filePath,directoryPath.resolve(filePath));
        //копируем тот же файл, но указываем другое имя
        //Files.copy(filePath,directoryPath.resolve("test16.txt"));
        //Если вызывать эти методы 2 раз будет Exception
        //так как они уже созданы
        //Если нужно перезаписать этот файл
       // Files.copy(filePath,directoryPath.resolve(filePath),
        //        StandardCopyOption.REPLACE_EXISTING);
        //Копируем папку в папку, без содержимого
        //Files.copy(directoryMPath,directoryPath.resolve("M"));

        //перемещение файла
        //Files.move(filePath,directoryPath.resolve("test15.txt"));
        //Files.move(Paths.get ("test2.txt"),Paths.get ("test11.txt"));

        //Files.delete(Paths.get("test11.txt"));
        //Files.delete(directoryMPath);



        System.out.println("Done");

    }
}
