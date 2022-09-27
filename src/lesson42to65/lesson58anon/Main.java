package lesson42to65.lesson58anon;

public class Main {
    public static void main(String[] args) {
        Popcorn popcorn = new Popcorn(){
            @Override
            void doSomething() {
                System.out.println("main");
            }
        };
        popcorn.doSomething();
        Popcorn popcorn1 = new Popcorn(){
            @Override
            void secondMethod() {
                System.out.println("main 2");
            }
        };
        popcorn1.secondMethod();
        Comparable comparable = o -> 0;
        Popcorn.m(new Popcorn(){
            @Override
            void doSomething() {
                System.out.println("Bal");
            }
        });
    }
}
class Popcorn{
    void doSomething(){
        System.out.println("popcorn");
    }
    void secondMethod(){
        System.out.println("Second");
    }
    static void m(Popcorn popcorn){
        popcorn.doSomething();
    }
}
