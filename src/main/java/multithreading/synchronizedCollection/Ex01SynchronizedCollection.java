package multithreading.synchronizedCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex01SynchronizedCollection {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> source = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            source.add(i);
        }
        //ArrayList<Integer> target = new ArrayList<>();
        // эта коллекция не синхронизированна и работая с
        //ней потоки могут давать непредсказуемый результат
        //поэтому

        List<Integer> synchList = Collections.synchronizedList(new ArrayList<>());
        //синхронизированная обертка для нашего листа

        Runnable runnable = () -> {
            synchList.addAll(source);
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(synchList);
    }
}
