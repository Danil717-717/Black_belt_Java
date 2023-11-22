package reflection_ex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Ex01Reflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        //v1
        Class employeeClass = Class.forName("reflection_ex.Employee");
        //v2
        Class employeeClass2 = Employee.class;
        //v3
        Employee emp = new Employee();
        Class employeeClass3 = emp.getClass();

        Field someFild = employeeClass.getField("id");
        //тип поля
        System.out.println("Type of id field = " + someFild.getType());

        System.out.println("-----");
        Field[] fields = employeeClass.getFields();
        for (Field field : fields) {
            System.out.println("Tipe of " + field.getName() +
                    " = " + field.getType());
        }

        System.out.println("-----");
        System.out.println("Все поля включая приват");
        Field[] allFields = employeeClass.getDeclaredFields();
        for (Field field : allFields) {
            System.out.println("Tipe of " + field.getName() +
                    " = " + field.getType());
        }


        System.out.println("----");
        Method someMethod1 = employeeClass.getMethod("increaseSalary");
        System.out.println("Return method: " + someMethod1.getName() + ", return type - " + someMethod1.getReturnType() +
                ", parametr type = " + Arrays.toString(someMethod1.getParameterTypes()));


        System.out.println("----");
        //если метод с параметрами, необходимо указывать типы параметров
        Method someMethod2 = employeeClass.getMethod("setSalary", double.class);
        System.out.println("Return method: " + someMethod2.getName() + ", return type - " + someMethod2.getReturnType() +
                ", parametr type = " + Arrays.toString(someMethod2.getParameterTypes()));


        System.out.println("----");
        Method[] methods = employeeClass.getMethods();
        for (Method method : methods) {
            System.out.println("Return method: " + method.getName() + ", return type - " + method.getReturnType() +
                    ", parametr type = " + Arrays.toString(method.getParameterTypes()));

        }

        System.out.println("----");
        Method[] allMethods = employeeClass.getDeclaredMethods();
        for (Method method : allMethods) {
            System.out.println("Return method: " + method.getName() + ", return type - " + method.getReturnType() +
                    ", parametr type = " + Arrays.toString(method.getParameterTypes()));

        }

        System.out.println("----");
        System.out.println("Вывод только публичных методов через проверку");
        Method[] allMethodsPublic = employeeClass.getDeclaredMethods();
        for (Method method : allMethodsPublic) {
            if(Modifier.isPublic(method.getModifiers()))
            System.out.println("Return method: " + method.getName() + ", return type - " + method.getReturnType() +
                    ", parametr type = " + Arrays.toString(method.getParameterTypes()));

        }

        System.out.println("----");
        System.out.println("Конструктор без параметров");
        Constructor constructor1 = employeeClass.getConstructor();
        System.out.println("Constructor has " + constructor1.getParameterCount()+
                " parameters, their type are: " + Arrays.toString(constructor1.getParameterTypes()));

        System.out.println("-----");
        System.out.println("Конструктор с параметрами");
        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class,String.class);
        System.out.println("Constructor has " + constructor2.getParameterCount()+
                " parameters, their type are: " + Arrays.toString(constructor2.getParameterTypes()));

        System.out.println("-----");
        System.out.println("Конструктоы в классе");
        Constructor[] constructors = employeeClass.getConstructors();
        for (Constructor constructor: constructors) {
            System.out.println("Construktor " + constructor.getName() +
                    " has " + constructor.getParameterCount() +
                            " parameters, their type are: " + Arrays.toString(constructor.getParameterTypes()));
        }

    }
}
