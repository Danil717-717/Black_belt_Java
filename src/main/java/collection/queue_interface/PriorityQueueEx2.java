package collection.queue_interface;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueEx2 {
    public static void main(String[] args) {
        Student st1 = new Student("Zaur", 3);
        Student st2 = new Student("Mariya", 1);
        Student st3 = new Student("Sergey", 4);
        Student st4 = new Student("Vasiliy", 2);
        Student st5 = new Student("Olga", 5);

        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(st1);
        priorityQueue.add(st2);
        priorityQueue.add(st3);
        priorityQueue.add(st4);
        priorityQueue.add(st5);

        System.out.println(priorityQueue);

        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());

    }
}

class Student implements Comparable<Student> {
    String name;
    int curse;

    public Student(String name, int curse) {
        this.name = name;
        this.curse = curse;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", curse=" + curse +
                '}';
    }

    @Override
    public int compareTo(Student other) {
        return this.curse - other.curse;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return curse == student.curse /*&& Objects.equals(name, student.name)*/;
    }

    @Override
    public int hashCode() {
        return Objects.hash(/*name,*/ curse);
    }
}

