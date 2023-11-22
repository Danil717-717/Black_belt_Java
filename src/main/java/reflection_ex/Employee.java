package reflection_ex;

public class Employee {
    public int id;
    public String name;
    public String departament;
    private  double salary = 1000;

    public Employee() {}

    public Employee(int id, String name, String departament) {
        this.id = id;
        this.name = name;
        this.departament = departament;
    }

//    public Employee(int id, String name, String departament, double salary) {
//        this.id = id;
//        this.name = name;
//        this.departament = departament;
//        this.salary = salary;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }

    private void changeDepartment(String newDepartment){
        departament=newDepartment;
        System.out.println("New department is: " + departament);
    }

    public void increaseSalary(){
        salary*=2;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", departament='" + departament + '\'' +
                ", salary=" + salary +
                '}';
    }
}
