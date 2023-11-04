package collection.list_interface;

import java.util.LinkedList;

public class LinkedListEx1 {
    public static void main(String[] args) {
        /*
        LinkedList - это звенья одной цепочки. Эти элементы хранят определенные
        данные и ссылки на предыдущий и следующий элемент

        Linkedlist имеет другое строение (в отличие от ArrayList)
        операция добавление удаление быстрее будет использовать
        LinkedList, тк в нем элементы содержат информацию и ссылки на
        предыдущий и следующий элемент. 0 элемент head содержит ссылку
        на null и 1 элемент, далее 1 элемент содержит ссылку на 0 и на 2 и тд,
        последний элемент tail содержит ссылку наа предыдущий и null,
        так и происходит поиск с 0 элемента перебором всего списка.

        как правило LinkedList используют:
        - Невелико кол-во операций получения элементов
        - Велико кол-во операций добавл удален элементов(особенно начало конец)
         */
        Student2 st1 = new Student2("Ivan", 3);
        Student2 st2 = new Student2("Nikolay", 2);
        Student2 st3 = new Student2("Elena", 1);
        Student2 st4 = new Student2("Petr", 4);
        Student2 st5 = new Student2("Mariya", 3);

        LinkedList<Student2> student2LinkedList = new LinkedList<>();
        student2LinkedList.add(st1);
        student2LinkedList.add(st2);
        student2LinkedList.add(st3);
        student2LinkedList.add(st4);
        student2LinkedList.add(st5);

        System.out.println(student2LinkedList);
        System.out.println(student2LinkedList.get(2));

        Student2 st6 = new Student2("Zaur", 3);
        Student2 st7 = new Student2("Igor", 4);

        student2LinkedList.add(st6);
        System.out.println(student2LinkedList);
        student2LinkedList.add(1,st7);
        System.out.println(student2LinkedList);

        student2LinkedList.remove(3);
        System.out.println(student2LinkedList);
    }
}

class Student2{
    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
