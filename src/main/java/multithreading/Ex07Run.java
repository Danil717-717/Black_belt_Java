package multithreading;

public class Ex07Run  implements Runnable{
    @Override
    public void run() {
        System.out.println("Method run. Thread name = " +
                Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Ex07Run());
        //thread.start(); // многопоточность
        thread.run();  //одно поточность как обычный метод
        System.out.println("Method main. Thread name = " +
                Thread.currentThread().getName());
    }
}
