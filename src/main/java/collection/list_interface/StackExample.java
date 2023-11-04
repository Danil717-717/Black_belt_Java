package collection.list_interface;

public class StackExample {
    /*
    Stack - устаревший synchronized класс. Использует принцип LIFO.
    Последний элемент снимается первым, как стопка тарелок.
    Не рекомендован к использованию.
     */

    static void abc1(){
        System.out.println("abc1 start");
        System.out.println("abc1 ends");
    }

    static void abc2(){
        System.out.println("abc2 start");
        abc1();
        System.out.println("abc2 ends");
    }

    static void abc3(){
        System.out.println("abc3 start");
        abc2();
        System.out.println("abc3 ends");
    }

    public static void main(String[] args) {
        System.out.println("main start");
        abc3();
        System.out.println("main ends");
    }
}
