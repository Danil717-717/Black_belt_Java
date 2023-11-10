package multithreading;

public class Ex10Join {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("method main begins");
        Thread thread = new Thread(new Worker());
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        thread.join();//(1500)
        System.out.println(thread.getState());
        // метод main будет ждать или пока
        // поток отработает или 1500 мсек
        // в join что будет быстрее, в данном
        // примере main отработает быстрее
        // чем второй поток
        // если будет в параметре например 4000
        // то сначала 2 поток выполнится, потом
        // сразу main
        System.out.println("method main end");
    }
}

class Worker implements Runnable{

    @Override
    public void run() {
        System.out.println("work begins");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work ends");
    }
}