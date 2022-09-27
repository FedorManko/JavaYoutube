package lesson42to65.lesson57innerclass;

public class Main {
    private int i = 5;
    static int q;
    Inner inner10 = new Inner();

    public Inner getInner10() {
        return inner10;
    }
    static class StaticInner{
        void method(){
            System.out.println(q);
        }
    }

    public static void main(String[] args) {
        Main.Inner inner = new Main().new Inner();
        StaticInner staticInner = new StaticInner();
        staticInner.method();
        inner.method();
        System.out.println(inner.k);
        Main main = new Main();
        main.mmm();
        main.m();
        Inner inner2 = main.new Inner();
        Inner inner1 = main.getInner10();
    }
    void m(){
        Inner inner1 = new Inner();
    }
    void mmm(){
        class NewInner{
            void method(){
                System.out.println("Bla");
            }
        }
        NewInner newInner = new NewInner();
        newInner.method();
    }
    class Inner{
        int k = 6;
        void method(){
            System.out.println(i);
            System.out.println(q);
            System.out.println(inner10);
        }
    }
}
class Second{
    void method(){
        Main.Inner inner = new Main().new Inner();
        inner.method();
    }
}
