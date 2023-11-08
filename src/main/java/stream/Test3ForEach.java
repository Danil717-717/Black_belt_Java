package stream;

import java.util.Arrays;

public class Test3ForEach {
    public static void main(String[] args) {
        int[] arr = {5,9,3,8,1};
        Arrays.stream(arr).forEach(el-> System.out.println(el));
        //метод референс
        Arrays.stream(arr).forEach(System.out::println);

        System.out.println();
        Arrays.stream(arr).forEach(el->{
            el*=2;
            System.out.println(el);
        });
        System.out.println("----");

        Arrays.stream(arr).forEach(Util::myMethod);
        Arrays.stream(arr).forEach(el->Util.myMethod(el));//тоже самое
    }
}

class Util{
    public static void myMethod(int a){
        a=a+5;
        System.out.println("Element: " + a);
    }
}
