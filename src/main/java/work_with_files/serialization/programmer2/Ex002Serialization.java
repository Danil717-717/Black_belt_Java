package work_with_files.serialization.programmer2;

import work_with_files.serialization.programmer1.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex002Serialization {
    public static void main(String[] args) {
        Employee employee;
        try (ObjectInputStream inputStream =
                     new ObjectInputStream(new FileInputStream("./src/main/java/work_with_files/serialization/employee2.bin"))){
            employee = (Employee) inputStream.readObject();
            System.out.println("Done!");
            System.out.println(employee);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
