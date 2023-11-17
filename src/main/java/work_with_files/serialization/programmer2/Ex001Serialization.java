package work_with_files.serialization.programmer2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Ex001Serialization {
    public static void main(String[] args) {
        List<String>employee;
        try (ObjectInputStream inputStream =
                new ObjectInputStream(new FileInputStream("./src/main/java/work_with_files/serialization/employee1.bin"))){
            employee= (ArrayList)inputStream.readObject();
            System.out.println("Done!");
            System.out.println(employee);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
