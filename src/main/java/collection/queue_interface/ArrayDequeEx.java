package collection.queue_interface;

import java.util.ArrayDeque;
import java.util.Deque;

/*
   Deque - double ended queue(двунаправленная очередь).
   В такой очереди элементы могут использоваться с обоих
   концов. Здесь работают оба правила - FIFO и LIFO

   ArrayDeque и LinkedDeque имеют одинаковые методы
 */
public class ArrayDequeEx {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

    /*
       addFirst() - добавление в начало  выбрасывает Exсeption
       addLast() -  добавление в конец   выбрасывает Exсeption
       offerFirst() - добавление в начало  не выбрасывает Exсeption
       offerLast() -  добавление в конец   не выбрасывает Exсeption
     */

        deque.addFirst(3);
        deque.addFirst(5);
        deque.addLast(7);
        deque.offerFirst(1);
        deque.offerLast(8);

        System.out.println(deque);

        /*
       removeFirst() - удаление в начало  выбрасывает Exсeption
       removeLast() -  удаление в конец   выбрасывает Exсeption
       pollFirst() - удаление в начало  не выбрасывает Exсeption
       pollLast() -  удаление в конец   не выбрасывает Exсeption
     */

        /*
       getFirst() - вывод первого элемента  выбрасывает Exсeption
       getLast() -  вывод последнего элемента  выбрасывает Exсeption
       peekFirst() - вывод первого элемента не выбрасывает Exсeption
       peekLast() -  вывод последнего элемента не выбрасывает Exсeption
     */


    }
}
