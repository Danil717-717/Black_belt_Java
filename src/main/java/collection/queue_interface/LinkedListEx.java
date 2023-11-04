package collection.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

/*
  queue - очередь по принципу FIFO
  queue - коллекция, хранящая последовательность элементов.
  Добавляется элемент в конец очереди, используется из
  начала очереди-FIFO

  Класс LinkedList имплементирует не только интерфейс List,
  но и интерфейс Deque
 */
public class LinkedListEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Zaur");
        queue.add("Oleg");
        queue.add("Ivan");
        queue.add("Mariya");
        queue.add("Alex");

        System.out.println(queue);

        /*
         если очередь фиксированного размера и мы
         добавим элемент через .add() который не
         поместится, то будет ошибка

          Нужно добавлять методом .offer(), просто
          не сможем его добавить, ошибки не будет,
         */

        Queue<String> queue1 = new LinkedList<>();
        queue1.offer("Zaur");
        queue1.offer("Oleg");
        queue1.offer("Ivan");
        queue1.offer("Mariya");
        queue1.offer("Alex");

        System.out.println(queue1);


        // .remove() - удаляет первый элемент из очереди
        System.out.println(queue1.remove());
        System.out.println(queue1);

        /*
        так же если вызвать метод .remove() больше чем
        элементов в коллекции, будет ошибка

        Есть метод .poll()
         */

        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());


        //.element() - показывает верхний элемент в очереди
        System.out.println(queue.element());

        /*
          если элементов не будет в коллекции
          метод .element() вызовет ошибку

          есть метод .peek()
         */

        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
    }
}
