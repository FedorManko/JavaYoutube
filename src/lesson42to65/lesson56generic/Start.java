package lesson42to65.lesson56generic;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        List<Child[]> list = new ArrayList<>();
        List list1  = new ArrayList<>();
        method(list);
        List<Parent> list2 = new ArrayList<>();
        list2.add(new Parent());
        list2.add(new Child());
        System.out.println(list2);
        List<Parent> list3 = new ArrayList<>();
        method2(list3);

    }
    static void  method(List<Child[]> parents){
        Child[] children = new Child[]{new Child(),new Child()};
        parents.add(children);
        System.out.println(parents);
    }
    static void method2(List<? super Parent> list){
        System.out.println(list);
        list.add(new Child());
    }
}
class Parent <T>{
    T t;
}
class Child extends Parent{

}

