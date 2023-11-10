package multithreading;

public class Ex11Volatile extends Thread{
    volatile boolean b = true;

    @Override
    public void run() {
        long counter = 0;
        while (b){
            counter++;
        }
        System.out.println("Loop is finished. " +
                "counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        Ex11Volatile thread = new Ex11Volatile();
        thread.start();
        Thread.sleep(3000);
        System.out.println("After 3 sec is time ...");
        thread.b = false;
        thread.join();
        System.out.println("End");
    }
}
