package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test6Chaining {
    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};

        /*
            создаем поток, отфильтруем его так, чтобы
            оставались только не четные числа, затем делим
            на 3 только те числа, которые делятся без
            остатка и найдем сумму оставшихся чисел
         */

        int res = Arrays.stream(arr).filter(e -> e % 2 == 1).
                map(e -> {
                    if (e % 3 == 0) {
                        e = e / 3;
                    }
                    return e;
                }).
                reduce((a, e) -> a + e).getAsInt();
        System.out.println(res);

        // сначала фильтр по нечетности: 3 1 5 9 21 81 7
        // потом которые делятся на 3 делим: 1 1 5 3 7 27 7
        // потом сложение 51

        //далее работаем со студентами

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
            имена сделать заглавными буквами, потом
            отфильтровать по полу(выбор только жен),
            и отсортируем по возрасту
         */

        students.stream().map(el -> {
                    el.setName(el.getName().toUpperCase());
                    return el;
                }).filter(el -> el.getSex() == 'f').
                sorted((x, y) -> x.getAge() - y.getAge()).
                forEach(el -> System.out.println(el));

    }

    /*
        Source(например коллекции, массив) ->
        intermediate methods(lazy)         ->
        Terminal method(eager - действующий сразу)
        промежуточные методы не работают пока
        не вызовится терминальный(конечный) метод
        например .forEach() - вывод или .reduce()
        они оба void
     */
}
