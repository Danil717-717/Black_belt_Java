package nested_classes.anonymous_class;

/*
     Anonymous class не имеет имени

     Anonymous сlass - это "обьявление" класса и
     одновременное создание обьекта

     В анонимных классах невозможно писать конструктор

     Анонимный класс может обращаться даже
     к private переменным внешнего класса

     Lambda expressions - это краткая форма
     написания анонимных классов
 */
public class AnonymousClassEx1 {

    private int x = 10;
    public static void main(String[] args) {
        Math3 math1 = new Math3() {
            AnonymousClassEx1 ac = new AnonymousClassEx1();
            int c = 10;

            void abc() {
            }

            @Override
            public int doOperation(int a, int b) {
                return a + b + ac.x;
            }
        };

        Math3 math2 = new Math3() {
            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }
        };

        System.out.println(math1.doOperation(3, 6));
        System.out.println(math2.doOperation(3, 6));
        //System.out.println(math3.abc);
    }
}

interface Math3 {
    int doOperation(int a, int b);
}
//class Math3 {
//    int doOperation(int a, int b){
//        return a/b;
//    }
//}

