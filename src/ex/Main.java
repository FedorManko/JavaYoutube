package ex;

import java.io.Serializable;

public class Main {
    static void print(){
        System.out.println("Main");
    }
    public static void main(String[] args) {
        A a = new B();
        a.print();
        Main main = null;
        main.print();
        int num = 0;
        for (int i = 0; i < 100; i++) {
            num = num++;

        }
        System.out.println(num);
    }
}
class  B extends  A{
    @Override
       void print(){
        System.out.println("B");
    }
}
class A{
     void print(){
        System.out.println("A");
    }
}
enum X{

}
abstract class C {
}