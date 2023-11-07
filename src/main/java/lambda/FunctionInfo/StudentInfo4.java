package lambda.FunctionInfo;

import lambda.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentInfo4 {
//    void testStud(ArrayList<Student> al, Predicate<Student> predicate) {
//        for (Student s : al) {
//            if (predicate.test(s)) {
//                System.out.println(s);
//            }
//        }
//    }



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

        StudentInfo4 studentInfo4 = new StudentInfo4();


        Function<Student,Double> f = student -> student.avgGrade;
        System.out.println(f);
        double res = avgOfSoms(students,student -> student.avgGrade);
        System.out.println(res);


    }

    public static double avgOfSoms(List<Student> list, Function<Student, Double> f) {
        double res = 0;
        for (Student st : list) {
            res += f.apply(st);
        }
        res = res/ list.size();
        return res;
    }
}