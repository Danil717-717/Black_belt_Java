package reflection_ex;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Calculator {
    void sum(int a, int b){
        int res = a+b;
        System.out.println("Сумма " + a + " и " + b + " = " + res );
    }

    void sub(int a, int b){
        int res = a-b;
        System.out.println("Разница " + a + " и " + b + " = " + res );
    }

    void mult(int a, int b){
        int res = a*b;
        System.out.println("Произведение " + a + " и " + b + " = " + res );
    }

    void div(int a, int b){
        int res = a/b;
        System.out.println("Частное " + a + " и " + b + " = " + res );
    }
}

class  TestCalc{
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        try (BufferedReader reader = new BufferedReader(new FileReader("./src/main/java/reflection_ex/testCalculate.txt"))){

            String methodName = reader.readLine();
            String firstArgument = reader.readLine();
            String secondArgument = reader.readLine();

            Calculator calculator = new Calculator();
            Class cl = calculator.getClass();

            Method method3 = null;

            Method[] methods = cl.getDeclaredMethods();
            for (Method myMethod: methods){
                if(myMethod.getName().equals(methodName)){
                    method3 = myMethod;
                }
            }

            method3.invoke(calculator,Integer.parseInt(firstArgument),
                    Integer.parseInt(secondArgument));


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
