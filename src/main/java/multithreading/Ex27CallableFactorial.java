package multithreading;

import java.util.concurrent.*;

public class Ex27CallableFactorial {
    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial3 factorial3= new Factorial3(9);
        Future<Integer> future = executorService.submit(factorial3);
        //из Future получаем результат
        try {
            System.out.println(future.isDone());//проверяем закончился ли наш таск
            System.out.println("Xotim poluchit rezultat");
            factorialResult = future.get();
            //не нужно использовать терминейт
            // тк factorRes сохраняет значение
            System.out.println("Poluchili res");
            System.out.println(future.isDone());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            System.out.println(e.getCause());//выводит причину
        }
        finally {
            executorService.shutdown();
        }
        System.out.println(factorialResult);

    }
}

class Factorial3 implements Callable<Integer> {
    int f;

    public Factorial3(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f <= 0) {
            throw new Exception("ne vernoe chislo");
        }
        int res = 1;
        for (int i = 1; i <= f; i++) {
            res *= i;
        }
        return res;
    }
}
