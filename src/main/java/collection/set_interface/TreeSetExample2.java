package collection.set_interface;


import java.util.Objects;
import java.util.TreeSet;

/*
  при переопределении equals() и hashCode()
  нужно брать из обьекта только тот элемент
   по которому сравнивается
 */

public class TreeSetExample2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student st1 = new Student("Zaur", 3);
        Student st2 = new Student("Mariya", 1);
        Student st3 = new Student("Sergey", 4);
        Student st4 = new Student("Vasiliy", 2);
        Student st5 = new Student("Olga", 5);
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);

        System.out.println(treeSet);
        Student st6 = new Student("Oleg", 3);
        Student st7 = new Student("Ivan", 2);
        Student st8 = new Student("Kiril", 4);

        //первый элемент
        System.out.println(treeSet.first());
        //последний элемент
        System.out.println(treeSet.last());

        //.headSet() - показать элементы меньше st6
        System.out.println(treeSet.headSet(st6));
        //.tailSet() - показать элементы больше равно st6
        System.out.println(treeSet.tailSet(st6));
        //.subSet() - показать элементы между st7 st8
        // больше или равно st7 между st8
        System.out.println(treeSet.subSet(st7,st8));

        // должно быть true  true
        System.out.println();
        System.out.println(st6.equals(st1));
        System.out.println(st6.hashCode()==st1.hashCode());

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
        return this.curse-other.curse;
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

