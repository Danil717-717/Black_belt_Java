package generics;

import java.util.ArrayList;
import java.util.List;

public class Subtyping {
    public static void main(String[] args) {
        X x = new Y();
        //List<X> list1 = new ArrayList<Y>();
        List<X> list2 = new ArrayList<X>();
        //List<Number> list3 = new ArrayList<Integer>();
        List<Number> list4 = new ArrayList<Number>();

        Info3<Integer> info3 = new Info3<>(3);
        int i = info3.getValue();
        System.out.println(i);

    }

}

class X{

}

class Y extends X{

}

class Info3 <T extends Number> {
    private T value;

    public Info3(T value) {
        this.value = value;
    }
    public String toString(){
        return "{[" + value + "]}";
    }

    public T getValue(){
        return value;
    }
}


//extends class implements interface
//          Number&I1&I2
class Info4 <T extends Number&I1&I2>{
    private T value;

    public Info4(T value) {
        this.value = value;
    }
    public String toString(){
        return "{[" + value + "]}";
    }

    public T getValue(){
        return value;
    }
}
interface I1{}
interface I2{}


