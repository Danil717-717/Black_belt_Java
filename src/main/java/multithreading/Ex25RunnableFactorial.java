package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex25RunnableFactorial {
    static int factorialResult;
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial factorial=new Factorial(5);
        executorService.execute(factorial);
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS);//подождать поток для вычислений
        System.out.println(factorialResult);
    }
}

class Factorial implements Runnable{
    int f;
    public Factorial(int f){
        this.f=f;
    }
    @Override
    public void run() {
        if(f<=0){
            System.out.println("ne vernoe chislo");
            return;
        }
        int res=1;
        for (int i = 1; i <=f ; i++) {
            res*=i;
        }
        Ex25RunnableFactorial.factorialResult = res;
    }
}
