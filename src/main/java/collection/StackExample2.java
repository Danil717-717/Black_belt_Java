package collection;

import java.util.Stack;

public class StackExample2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Zaur");  // низ стека
        stack.push("Misha");
        stack.push("Oleg");
        stack.push("Katya"); //верх стека
        System.out.println(stack);

        //.pop - возвращает элемент на самом верху Steck и
        // удаляет его
        stack.pop();
        System.out.println(stack);

//        while (!stack.isEmpty()){  //проверка пустой ли стек
//            System.out.println(stack.pop()); //если не пустой удали верхн элемент
//            System.out.println(stack);
//        }

        //.peek - возвращает верхний элемент стека, но не возвращает его
        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
