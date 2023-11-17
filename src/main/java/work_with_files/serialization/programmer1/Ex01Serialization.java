package work_with_files.serialization.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Ex01Serialization {
    public static void main(String[] args) {
        List<String>employee = new ArrayList<>();
        employee.add("Zaur");
        employee.add("Ivan");
        employee.add("Elena");

        try(ObjectOutputStream outputStream =
                new ObjectOutputStream(
                        new FileOutputStream("./src/main/java/work_with_files/serialization/employee1.bin"))){

            outputStream.writeObject(employee);
            System.out.println("Done!");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
