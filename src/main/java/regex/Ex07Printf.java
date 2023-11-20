package regex;

public class Ex07Printf {
    static void emploeeInfo(Emploee emploee){
        /*
        % -
        0 - если (id) равен 1, то перед ней увидим 00
           те свободные места заполняются 0-ми
        3 - выделяется 3 цифры(id)
        d - работа с целыми числами

        - - по левой стороне
        12 - выделяется 12 символов
        s - работаем со String

        , - разделитель разрядов чисел
        .1 - 1 цифра после запятой
         */
        System.out.printf("%03d \t Hello %-12s \t %-12s \t %,.1f \n",
                emploee.id,emploee.name,emploee.surname,emploee.salary*(1+emploee.bonusPct));
    }

    public static void main(String[] args) {
//        System.out.printf("string -nuzhno viravnit po levomu krau" +
//                " a vtoroy parametr - double, nado okruglit do desyztix",
//                "privet","3.1415");
            // 1 параметр как, 2 параметр что, 3 что

        Emploee em1 = new Emploee(1,"Zaur","Tregulov",
                12345,0.15);
        Emploee em2 = new Emploee(15,"Ivan","Petrov",
                6542,0.08);
        Emploee em3 = new Emploee(123,"Mariya","Sidorova",
                8567,0.12);
        emploeeInfo(em1);
        emploeeInfo(em2);
        emploeeInfo(em3);

        System.out.println();

        String newString = String.format("%03d 	 Hello %-12s 	 %-12s 	 %,.1f",
                1,"Zaur","Treg", 12345*(1+0.15));
        System.out.println(newString);

    }


}

class  Emploee{
    int id;
    String name;
    String surname;
    int salary;
    double bonusPct;

    public Emploee(int id, String name, String surname, int salary, double bonusPct) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonusPct = bonusPct;
    }
}
