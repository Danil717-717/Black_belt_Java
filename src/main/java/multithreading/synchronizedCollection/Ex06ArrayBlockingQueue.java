package multithreading.synchronizedCollection;

import java.util.concurrent.ArrayBlockingQueue;

public class Ex06ArrayBlockingQueue {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);

        //Produser
        new Thread(()->{
            int i = 0;
            while (true){
                try {
                    queue.put(++i);
                    System.out.println("Produser dobavil: " + i + " " + queue);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        //Consumer
        new Thread(()->{
            while (true){
                try {
                    Integer j = queue.take();
                    System.out.println("Concumer zabral: " + j + " " + queue);
                    Thread.sleep(9000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}
