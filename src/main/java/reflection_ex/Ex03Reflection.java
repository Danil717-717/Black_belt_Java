package reflection_ex;

import java.lang.reflect.Field;

public class Ex03Reflection {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee(10, "Zozo", "It");
        // получить доступ к приват полям
        // без конструктора и геттеров сеттеров
        Class employeeClass = employee.getClass();
        Field field = employeeClass.getDeclaredField("salary");
        //даем доступ себе к открытию поля
        field.setAccessible(true);
        double salaryValue = (Double) field.get(employee);
        System.out.println(salaryValue);

        // так же можно изменить или задать значение полю
        field.set(employee,1500);
        System.out.println(employee);





    }
}
