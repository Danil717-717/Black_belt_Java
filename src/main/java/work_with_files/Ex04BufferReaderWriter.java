package work_with_files;

import java.io.*;

public class Ex04BufferReaderWriter {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(
                new FileReader("./src/main/java/work_with_files/Test3.txt"));
             BufferedWriter writer = new BufferedWriter(
                     new FileWriter("./src/main/java/work_with_files/Test4.txt"))) {

//            int character;
//            while ((character=reader.read())!=-1){
//                writer.write(character);
//            }


            String line;
            while ((line= reader.readLine())!=null){
                writer.write(line);
                writer.write('\n');
            }
            System.out.println("Done!");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
