package multithreading;

import java.util.concurrent.CountDownLatch;

public class Ex30CountDownLatch {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStaffOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market staff came to work");//какая то работа
        countDownLatch.countDown();                      // уменьшаем счетчик на еденицу
        System.out.println("countDownLatch = " + countDownLatch.getCount()); // выводим текущее значение счетчика
    }
    private static void everythingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Every is ready, so let's open market");//какая то работа
        countDownLatch.countDown();                      // уменьшаем счетчик на еденицу
        System.out.println("countDownLatch = " + countDownLatch.getCount()); // выводим текущее значение счетчика
    }
    private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Market is open");//какая то работа
        countDownLatch.countDown();                      // уменьшаем счетчик на еденицу
        System.out.println("countDownLatch = " + countDownLatch.getCount()); // выводим текущее значение счетчика
    }

    public static void main(String[] args) throws InterruptedException {
        new Friend("Zaur",countDownLatch);
        new Friend("Oleg",countDownLatch);
        new Friend("Elena",countDownLatch);
        new Friend("Viktor",countDownLatch);
        new Friend("Marina",countDownLatch);

        marketStaffOnPlace();
        everythingIsReady();
        openMarket();


    }
}

class Friend extends Thread{
    String name;
    private CountDownLatch countDownLatch;

    public Friend(String name,CountDownLatch countDownLatch){
        this.name = name;
        this.countDownLatch=countDownLatch;
        this.start();
    }
    public void run(){
        try {
            countDownLatch.await();
            System.out.println(name + " pristupil k zakupram");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


