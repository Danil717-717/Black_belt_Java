package work_with_files.serialization.programmer1;

import java.io.Serializable;

public class Employee implements Serializable {
    static final long serialVersionUID = 2;
    String name;
    String surname;
    String departament;
    //int age;
    //если зарплату отправлять не нужно
    // помечаем transient(временный)
    transient double salary;
    Car car;

    public Employee(String name, String surname, String departament, /*int age,*/ double salary, Car car) {
        this.name = name;
        this.surname = surname;
        this.departament = departament;
        //this.age = age;
        this.salary = salary;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", departament='" + departament + '\'' +
                //", age=" + age +
                ", salary=" + salary +
                ", car=" + car +
                '}';
    }
}
