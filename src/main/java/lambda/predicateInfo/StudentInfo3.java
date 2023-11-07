package lambda.predicateInfo;

import lambda.Student;

import java.util.ArrayList;
import java.util.function.Predicate;

public class StudentInfo3 {
    void testStud(ArrayList<Student> al, Predicate<Student> predicate) {
        for (Student s : al) {
            if (predicate.test(s)) {
                System.out.println(s);
            }
        }
    }
}

class TestT {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo3 stInf3 = new StudentInfo3();
        stInf3.testStud(students,student -> student.avgGrade > 8);
        System.out.println("-----");

        Predicate<Student> p1 = student -> student.avgGrade>7.5;
        Predicate<Student> p2 = student -> student.sex == 'm';
        stInf3.testStud(students,p1);
        System.out.println("----");
        stInf3.testStud(students,p2);
        System.out.println("----");

        // метод обьединения .and() выполняется 2 условия
        stInf3.testStud(students,p1.and(p2));
        System.out.println("-----");

        // метод обьединения .or() выполняется хотя бы 1 условие
        stInf3.testStud(students,p1.or(p2));

        //метод отрицания .negate()
        stInf3.testStud(students,p1.negate());


    }
}
