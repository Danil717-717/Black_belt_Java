package multithreading;

public class Ex16Synchronize {
    // Если все методы будут синхронизированы,
    // то они будут синхронизированные по разным
    // объектам.
    // Создается объект для синхронизации по одному
    // объекту, чаще называют его lock(замок)
    static final Object lock = new Object();

     void mobileCall(){
        synchronized (lock) {
            //System.out.println(this);
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mobile call ends");
        }
    }

     void skypeCall(){
        synchronized (lock) {
            //System.out.println(this);
            System.out.println("Skype call starts");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Skype call ends");
        }
    }

    void watsAppCall(){
        synchronized (lock) {
            //System.out.println(this);
            System.out.println("WatsApp call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("WatsApp call ends");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImplMobile());
        Thread thread2 = new Thread(new RunnableImplSkype());
        Thread thread3 = new Thread(new RunnableImplWatsapp());
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class RunnableImplMobile implements Runnable{

    @Override
    public void run() {
        new Ex16Synchronize().mobileCall();
    }
}
class RunnableImplSkype implements Runnable{

    @Override
    public void run() {
        new Ex16Synchronize().skypeCall();
    }
}

class RunnableImplWatsapp implements Runnable{
    @Override
    public void run() {
        new Ex16Synchronize().watsAppCall();
    }
}
