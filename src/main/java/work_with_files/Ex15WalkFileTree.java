package work_with_files;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Ex15WalkFileTree {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("C:\\Users\\start\\OneDrive\\Рабочий стол\\Y");
        Path destination = Paths.get("C:\\Users\\start\\OneDrive\\Рабочий стол\\CopeHear");

        Files.walkFileTree(source, new MyFileVisitor2(source, destination));
        System.out.println("Done!");
    }
}

class MyFileVisitor2 extends SimpleFileVisitor<Path>{
    Path source;
    Path destination;


    public MyFileVisitor2(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        // получаем дерево директории
        Path newDestination = destination.resolve(source.relativize(dir));
        //после того как нашли копируем
        Files.copy(dir, newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        // так же получаем дерево файлов в директории
        Path newDestination = destination.resolve(source.relativize(file));
        //после того как нашли копируем
        Files.copy(file, newDestination);
        return FileVisitResult.CONTINUE;
    }
}
