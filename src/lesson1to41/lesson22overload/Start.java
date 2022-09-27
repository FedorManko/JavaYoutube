package lesson1to41.lesson22overload;

public class Start {
    public static void main(String[] args) {
        Start start = new Start();
        short b = 5;
        start.method(( 5));
    }
    //void method(int i){
    //    System.out.println("int");
   // }
   // void method (long i){
   //     System.out.println("long");
   // }
    void method(Integer i){
        System.out.println("Integer");
    }
   // void method(double i){
   //     System.out.println("double");
   // }
    //void method(short... i){
   //     System.out.println("short...");
  //  }
   // void method(Short i){
    //    System.out.println("Short");
    //}
   // void method(Object i){
   //     System.out.println("Object");
   // }
   // void method(Object... i){
    //    System.out.println("Object...");
   // }
  //  void method(byte i){
   //     System.out.println("byte");
   // }
}
