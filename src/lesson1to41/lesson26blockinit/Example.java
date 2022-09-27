package lesson1to41.lesson26blockinit;
class Parent{
    static {
        System.out.println("static parent init");
    }
    {
        System.out.println("parent init");
    }
    Parent(){
        System.out.println("parent const");
    }
}
public class Example extends Parent {
    {
        System.out.println("init");
    }
    static {
        System.out.println("static init");
    }
    Example(){
        System.out.println("const");

    }
    public static void main(String[] args) {
    new Example();
    }
}
