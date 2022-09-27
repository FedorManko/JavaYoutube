package lesson1to41.lesson24ovverride;

public class Parent {
     int method() throws Exception{
        return 1;
    }
    static void show(){
        System.out.println("static Parent");
    }
    Parent run(){
         return new Parent();
    }

}
