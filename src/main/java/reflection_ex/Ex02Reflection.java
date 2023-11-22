package reflection_ex;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex02Reflection {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
            IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class employeeClass = Class.forName("reflection_ex.Employee");

        //создаем обьект без параметров
        Employee o = (Employee) employeeClass.newInstance();
        System.out.println(o);

        Constructor constructor1 = employeeClass.getConstructor();
        Object obj1 = constructor1.newInstance();

        Constructor<Employee> constructor2 = employeeClass.getConstructor();
        Employee obj2 = constructor2.newInstance();


        //создадим обьект с помощью конструктора
        Constructor constructor3 = employeeClass.getConstructor(int.class,
                String.class,String.class);
        Object obj3 = constructor3.newInstance(3,"Zaur","IT");
        System.out.println(obj3);

        Method method = employeeClass.getMethod("setSalary", double.class);
        method.invoke(obj3,800.88);
        System.out.println(obj3);



    }
}
