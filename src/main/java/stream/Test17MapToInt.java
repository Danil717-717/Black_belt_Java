package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test17MapToInt {
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


        List<Integer> courses = students.stream().
                mapToInt(el -> el.getCourse()).
                boxed(). //метод .boxed() конвертирует
                        collect(Collectors.toList());

        System.out.println(courses);

        List<Double> avg = students.stream().
                mapToDouble(el -> el.getAvgGrade()).
                boxed(). //метод .boxed() конвертирует
                        collect(Collectors.toList());

        System.out.println(avg);

        int sum = students.stream().mapToInt(el-> el.getCourse()).sum();
        System.out.println(sum);

        double average= students.stream().mapToInt(el-> el.getCourse()).average().getAsDouble();
        System.out.println(average);


        int min = students.stream().mapToInt(el-> el.getCourse()).min().getAsInt();
        System.out.println(min);

        int max = students.stream().mapToInt(el-> el.getCourse()).max().getAsInt();
        System.out.println(max);
    }
}
