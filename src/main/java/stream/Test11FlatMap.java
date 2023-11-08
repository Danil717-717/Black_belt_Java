package stream;

import java.util.ArrayList;
import java.util.List;

public class Test11FlatMap {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied Mathematics");
        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);
        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        /*
            Мы имеем факультеты, у каждого факультета
            листы со студентами, и чтобы вывести имена
            этих студентов:
         */

        facultyList.stream().flatMap(faculty -> faculty.studentsOnFac.stream()).forEach(el-> System.out.println(el.getName()));



    }
}

class Faculty{
    String name;
    List<Student> studentsOnFac;

    public Faculty(String name) {
        this.name = name;
        studentsOnFac = new ArrayList<>();
    }

    public List<Student> getStudentsOnFac() {
        return studentsOnFac;
    }

    public void addStudentToFaculty(Student stud){
        studentsOnFac.add(stud);
    }
}
