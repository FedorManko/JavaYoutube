package lesson155to200.lesson155overloading;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.method(56.6,1);
        main.method(58, 5.5);
        main.method(new Child());
        main.method(new Parent());
        main.method(null);
    }
     private synchronized String method(double d, int i) throws NullPointerException{
        System.out.println("string");
        return "S";
    }
    protected strictfp void method(int i, double d) throws OutOfMemoryError{
        System.out.println("int");
    }
    void method(Parent parent){
        System.out.println("Parent");
    }
    void method(Child child){
        System.out.println("child");
    }
}
class Parent{

}
class Child extends Parent{

}