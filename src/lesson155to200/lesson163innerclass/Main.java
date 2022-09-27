package lesson155to200.lesson163innerclass;

public class Main {
    int i;
   private static int j;
    class Inner{
        int q = i;
        int w = j;
        void method(){
            int a = q +w ;
            Inner inner = new Inner();
        }
        static int k;
        static void method2(){

        }
    }
    public static void main(String[] args) {
                Inner inner = new Main().new Inner( );
    }
}
class Other{
    Main.Inner inner= new Main().new Inner();
}
