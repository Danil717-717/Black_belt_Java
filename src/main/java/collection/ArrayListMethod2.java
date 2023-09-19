package collection;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethod2 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", "m", 22, 3, 8.3);
        Student st2 = new Student("Nikolay", "m", 28, 2, 6.4);
        Student st3 = new Student("Elena", "f", 19, 1, 8.9);
        Student st4 = new Student("Petr", "m", 35, 4, 7);
        Student st5 = new Student("Mariya", "f", 23, 3, 7.3);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);
        System.out.println(studentList);

        Student st6 = new Student("Mariya", "f", 23, 3, 7.3);
        studentList.remove(st6);
        System.out.println(studentList);
    }

}

class Student{
    private String name;
    private String sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, String sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String toString(){
        return "Student(" +
                "name= ' " + name + '\'' +
                ", sex = " + sex +
                ", age = " + age +
                ", course = " + course +
                ", avgGrade = " + avgGrade +
                " )";
    }

    //переопределение метода equals теперь нам дает сравнение
    // обьектов не по хеш коду, а по параметрам, т.е st5 и st6
    // теперь будут равны, а метод remove удаляет элемент с такими параметрами
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && course == student.course && Double.compare(avgGrade, student.avgGrade) == 0 && Objects.equals(name, student.name) && Objects.equals(sex, student.sex);
    }


}
