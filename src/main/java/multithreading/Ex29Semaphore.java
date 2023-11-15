package multithreading;

import java.util.concurrent.Semaphore;

public class Ex29Semaphore {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);

        new Person("Zaur", callBox);
        new Person("Ivan", callBox);
        new Person("Oleg", callBox);
        new Person("Elena", callBox);
        new Person("Marina", callBox);
    }
}

class Person extends Thread{
    String name;
    private Semaphore callBox;
    public Person(String name, Semaphore callBox){
        this.name=name;
        this.callBox = callBox;
        this.start();
    }

    public void run(){
        try {
            System.out.println(name + " zdet...");
            callBox.acquire();
            System.out.println(name + " polzuetsyz telephonom");
            sleep(2000);
            System.out.println(name + " zvonok okonchen");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            callBox.release();//мы освобождаем разрешение симафора
            //тем самым увеличивается счетчик на 1, всегда finally
        }
    }

}
