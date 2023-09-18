package generics;

public class ParameterizedClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("privet");
        System.out.println(info1);
        String s = info1.getValue();


        Info<Integer> info2 = new Info<>(18);
        System.out.println(info2);
        Integer i1 = info2.getValue();
    }
}


class Info <T> {  //<E>- элементы  <K>- key(ключи) <V>- value
                  // <T> type placeholder заполнитель
    private T value;

    public Info(T value) {
        this.value = value;
    }
    public String toString(){
        return "{[" + value + "]}";
    }

    public T getValue(){
        return value;
    }
}