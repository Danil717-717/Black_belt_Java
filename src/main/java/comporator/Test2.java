package comporator;


import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Zaur", "Tregulov", 12345);
        Employee emp2 = new Employee(15, "Ivan", "Petrov", 6542);
        Employee emp3 = new Employee(123, "Ivan", "Sidorov", 8542);
        //так не сможем отсортировать, тк java не знает по каким параметрам это делать
        //Arrays.sort(new Employee [] {emp1, emp2, emp3});
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        System.out.println("Before sorting \n" + list);
        Collections.sort(list);
        //Collections.sort(list, new IdComparator());
        //Collections.sort(list, new NameComparator());
        //Collections.sort(list, new SalaryComparator());
        System.out.println("After sort \n" + list);
    }

}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    //сравниваем текущий обьект с обьектом в параметре
    // если равен return 0, меньше -1, больше 1
    //интерфейс Comparable используется для сравнения обьектов,
    // используя естественный порядок (например по id)
    @Override
    public int compareTo(Employee anotherEmp) {
        if (this.id == anotherEmp.id) {
            return 0;
        } else if (this.id < anotherEmp.id) {
            return -1;
        } else {
            return 1;
        }
        // return this.id - anotherEmp.id;
        //return this.id.compareTo(anotherEmp.id);
        //return this.name.compareTo(anotherEmp.name);

//        int res = this.name.compareTo(anotherEmp.name);
//        if(res == 0 ){
//            return this.surname.compareTo(anotherEmp.surname);
//        }
//        return res;

    }
}

//class IdComparator implements Comparator<Employee>{
//
//    @Override
//    public int compare(Employee emp1, Employee emp2) {
//        if(emp1.id == emp2.id){
//            return 0;
//        } else if (emp1.id < emp2.id) {
//            return -1;
//        }else{
//            return 1;
//        }
//    }
//}

class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.salary - emp2.salary;
    }
}