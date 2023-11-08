package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Test12Collect {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        /*
            меняем имена студентов на заглавные буквы
            и потом сгруппировать студентов по курсу,
            те отдельный лист со студентами 1ого курса,
            2ого и тд
         */

        Map<Integer,List<Student>> map1 = students.stream().map(el-> {
            el.setName(el.getName().toUpperCase());
            return el;
        }).collect(Collectors.groupingBy(el->el.getCourse()));

        System.out.println(map1);

        for (Map.Entry<Integer,List<Student>> entry: map1.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }

        /*
            разделим студентов по среднему баллу успеваемости
            метод .partitioningBy возвращает boolean ключем

         */

        Map<Boolean,List<Student>> map2 = students.stream().
                collect(Collectors.partitioningBy(el->el.getAvgGrade()>7));

        for (Map.Entry<Boolean,List<Student>> entry: map2.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
    }
}
