package lesson42to65.lesson56generic;

import java.io.Serializable;

public class Main <T extends Main & Comparable & Serializable > {
    T var;
    public static void main(String[] args) {
        Main<Car> main = new Main();
        main.var = new Car();
        main.method(main.var);

    }
     T method(T type){
        System.out.println(type);
        type.someMethod();
        return type;
    }
    void someMethod(){
        System.out.println("bla");
    }

}
class Car extends Main implements  Comparable, Serializable {

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

