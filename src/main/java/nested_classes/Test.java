package nested_classes;

/*
    nested classes (вложенные) бывают
    static
    inner
    local
    anonymous
 */
public class Test {
    static class A{}  //статичный
    class B{}         // иннер класс
    void method(){
        class C{}     // локальный класс
    }
}
