package multithreading;

public class Ex22Interrupt {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main starts");
        InterruptThread thread = new InterruptThread();
        thread.start();
        Thread.sleep(2000);
        //thread.stop();// старый способ прирывания потока,не нужен
        thread.interrupt(); //проверка на прерывание потока

        thread.join();
        System.out.println("main stop");
    }
}

class InterruptThread extends Thread {
    double sqrtSum = 0;

    // сумма всех корней от 1 до 1000000000
    public void run() {
        for (int i = 1; i < 1000000000; i++) {
            if (isInterrupted()) { //тут поймается сигнал о том что поток хотят прервать
                System.out.println("Potok hotayt prervat");
                System.out.println("Mi ubedilis, chto sostoyanie" +
                        " vseh objectov normalnoe i reshili " +
                        "zavershit potok");
                System.out.println(sqrtSum);
                return; // хотим прерываем, хотим дальше работаем
            }
            sqrtSum += Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println(" Potok xotyat prervat " +
                        "vo vremya sna. Zavershim ego rabotu");
                System.out.println(sqrtSum);
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}
