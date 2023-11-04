package collection.queue_interface;

import java.util.PriorityQueue;

/*
   PriorityQueue - это специальный вид очереди, в котором
   используется натуральная сортировка или та,
   которую мы описываем с помощью Comporable или
   Comporator. Таким образом используется тот элемент
   из очереди, приоритет которого выше.
 */
public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(1);
        priorityQueue.add(7);
        priorityQueue.add(10);
        priorityQueue.add(8);
        // при выводе элементов приоритетность может
        // не соблюдаться
        System.out.println(priorityQueue);

        // но при использовании она соблюдается
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
    }
}
