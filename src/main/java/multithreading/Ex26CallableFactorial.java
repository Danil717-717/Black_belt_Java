package multithreading;

import java.util.concurrent.*;

public class Ex26CallableFactorial {
    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial2 factorial2= new Factorial2(9);
        Future<Integer> future = executorService.submit(factorial2);
        //из Future получаем результат
        try {
            factorialResult = future.get();
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

class Factorial2 implements Callable<Integer> {
    int f;
    public Factorial2(int f){
        this.f=f;
    }

    @Override
    public Integer call() throws Exception {
        if(f<=0){
            throw  new Exception("ne vernoe chislo");
        }
        int res=1;
        for (int i = 1; i <=f ; i++) {
            res*=i;
        }
        return res;
    }
}
