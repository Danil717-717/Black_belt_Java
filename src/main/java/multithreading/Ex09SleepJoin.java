package multithreading;

public class Ex09SleepJoin extends Thread{

    public void run() {
        for (int i = 1; i <=10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+
                    " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable1());
        Ex09SleepJoin thread2 = new Ex09SleepJoin();
        thread1.start();
        thread2.start();

        thread1.join();  // без .join() поток main выполняется
        thread2.join();  // первым, с .join() main ждет

        System.out.println("Konec!");
    }
}

class MyRunnable1 implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <=10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+
                    " " + i);
        }
    }
}
