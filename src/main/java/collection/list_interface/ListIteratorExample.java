package collection.list_interface;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    // поик полиндрома (слово читается одинаково с начала и с конца)
    public static void main(String[] args) {
        String s = "madam";
        List<Character> list = new LinkedList<>();
        for(char ch: s.toCharArray()){
            list.add(ch);
        }
        //из строки s буквы поместили в массив чаров

        ListIterator<Character> iterator = list.listIterator(); //идет с лева на права
        ListIterator<Character> reversIterator = list.listIterator(list.size());// с конца на лево

        boolean isPalindrome = true;
        while (iterator.hasNext() && reversIterator.hasPrevious()){
            if(iterator.next() != reversIterator.previous()){
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("Palindrome");
        }else {
            System.out.println("NOT palindrome");
        }
    }

}
