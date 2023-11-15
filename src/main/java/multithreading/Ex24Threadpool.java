package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Ex24Threadpool {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(1);
//        for (int i = 0; i < 10; i++) {
//            scheduledExecutorService.execute(new RunnableImpl200());
//
//        }
//        scheduledExecutorService.schedule(new RunnableImpl200(),
//                3, TimeUnit.SECONDS);
//        scheduledExecutorService.shutdown();

//        scheduledExecutorService.scheduleAtFixedRate(new RunnableImpl200(),
//                3,1,TimeUnit.SECONDS);

        scheduledExecutorService.scheduleWithFixedDelay(new RunnableImpl200(),
                3,1,TimeUnit.SECONDS);
        Thread.sleep(10000);
        scheduledExecutorService.shutdown();

        ExecutorService executorService = Executors.newCachedThreadPool();
        //создает новый тредпул, который будет создавать
        //потоки по надобности
    }

}

class RunnableImpl200 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " begins work");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() +
                " bends work");
    }
}
