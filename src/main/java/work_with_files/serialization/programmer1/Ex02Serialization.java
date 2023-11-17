package work_with_files.serialization.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex02Serialization {
    public static void main(String[] args) {
        Car car = new Car("Nissan", "white");
        Employee employee = new Employee(
                "Mariya","Sodorova", "IT", 500,car);

        try (ObjectOutputStream outputStream =
                     new ObjectOutputStream(
                             new FileOutputStream("./src/main/java/work_with_files/serialization/employee2.bin")
                     )){
            outputStream.writeObject(employee);
            System.out.println("Done!");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
