package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ex20BankomatLock {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Employee("Zaur",lock);
        new Employee("Oleg",lock);
        new Employee("Elena",lock);
        new Employee("Viktor",lock);
        new Employee("Marina",lock);

    }
}


class Employee extends Thread{
    String name;
    private Lock lock;
    public Employee(String name, Lock lock){
        this.name =  name;
        this.lock =  lock;
        this.start();
    }
    public void run(){
//        try {
//            System.out.println(name + " ждет... " );
//            lock.lock();
//            System.out.println(name + " пользуется банкоматом" );
//            Thread.sleep(2000);
//            System.out.println(name + " завершение сеанса" );
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        finally {
//            lock.unlock();
//        }
        if (lock.tryLock()) {//если свободно пользуйся банкоматом
            try {
                System.out.println(name + " пользуется банкоматом");
                Thread.sleep(2000);
                System.out.println(name + " завершение сеанса");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }else { // если занят банкомат, можешь заниматься своими делами
            System.out.println(name + " не хочет ждать в очереди");
        }
    }
}