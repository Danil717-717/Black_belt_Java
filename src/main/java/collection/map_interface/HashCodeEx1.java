package collection.map_interface;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {

    /*
    если Вы переопределили equals, то переопределите и hashcode
    результат нескольких выполнений метода hashcode для одного и того же
     обьекта должен быть одинаковым
    если по equals обьекты равны, то и hashcode тоже должен быть одинаковым
    если по equals обьекты НЕ равны, hashcode может быть одинаковым - кализия

    рекомендуется ключи ставить неизменяемыми обьектами
     */

    public static void main(String[] args) {
        Map<Student, Double> map1 = new HashMap<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);

        map1.put(st1, 7.8);
        map1.put(st2, 8.5);
        map1.put(st3, 9.3);
        System.out.println(map1);

        Student st4 = new Student("Zaur", "Tregulov", 3);
        boolean res = map1.containsKey(st4);
        System.out.println(res);

        System.out.println(st1.hashCode());
        System.out.println(st4.hashCode());
        System.out.println(st3.hashCode());


        for(Map.Entry<Student,Double> entry: map1.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        /*
        - Initial capacity - начальный размер массива
        - Load factor - коэфициент того, начколько массив
        должен быть заполнен, после чего увеличен в двое
        (16, 0.75f) - 16*0,75 = 12 т.е после 12 элементов будет увелич
         */

        Map<Integer, String> map2 = new HashMap<>(16, 0.75f);
    }
}

final class Student implements Comparable<Student>{
    final String name;
    final String surname;
    final int course;



    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Stident{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student stident = (Student) o;
        return course == stident.course && Objects.equals(name, stident.name) && Objects.equals(surname, stident.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }



    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

//    @Override
//    public int hashCode(){
//        return name.length()*7 + surname.length()*11 + course * 56;
//    }
}
