package lambda;

public class Test3 {
    static void def(I1 i){
        System.out.println(i.abc());
    }

    public static void main(String[] args) {
        def(() -> 18);
    }
}

interface I1{
    int abc();
}

