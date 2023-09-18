package generics;

//стирание типа для обратной совместимости кода

import generics.igra.Participant;

import java.util.ArrayList;

public class TypeErasure {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        //ArrayList al1 = new ArrayList();
        int i = al1.get(0);
        //int i = (Integer)al1.get(0);

    }
    public void abc (Info<String> info){
        String s = info.getValue();
    }
//    public void abc (Info<Integer> info){
//        Integer i = info.getValue();
//    }

    //abc(Info info)
}

class Parent{
    public void abc(Info<String> info){
        String s = info.getValue();
    }
}

class Child extends Parent{
//    public void abc(Info<Integer> info){
//        Integer i = info.getValue();
//    }
}
