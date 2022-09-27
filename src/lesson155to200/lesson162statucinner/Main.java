package lesson155to200.lesson162statucinner;

public class Main {
     private static int i = 1;
    int j = 2;
    public static void main(String[] args) {
        Inner inner = new Inner();
        inner.method();
        Main main = new Main();
        Inner2 inner2 = main.new Inner2();

    }
    static class Inner{
        int q =i;
        void method(){

        }
        int getI(){
            return i;
        }

        public Inner() {
        }
        static int h;
        static void method2(){

        }
    }
    class Inner2{

    }
}
class Other extends Main.Inner{
    public static void main(String[] args) {
        Main.Inner inner = new Main.Inner();
        inner.getI();
    }
}