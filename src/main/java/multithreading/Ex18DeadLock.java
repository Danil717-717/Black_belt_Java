package multithreading;

public class Ex18DeadLock {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();
        thread10.start();
        thread20.start();
    }
}

class Thread10 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread10: попытка захватить монитор обьекта lock1");
        synchronized (Ex18DeadLock.lock1){
            System.out.println("Thread10: Монитор обьекта lock1 захвачен");
            System.out.println("Thread10: попытка захватить монитор обьекта lock2");
            synchronized (Ex18DeadLock.lock2){
                System.out.println("Thread10: Мониторы обьектов lock1 и lock2 захвачены");
            }
        }
    }
}

class Thread20 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread20: попытка захватить монитор обьекта lock2");
        synchronized (Ex18DeadLock.lock2){
            System.out.println("Thread20: Монитор обьекта lock2 захвачен");
            System.out.println("Thread20: попытка захватить монитор обьекта lock1");
            synchronized (Ex18DeadLock.lock1){
                System.out.println("Thread20: Мониторы обьектов lock1 и lock2 захвачены");
            }
        }
    }
}
