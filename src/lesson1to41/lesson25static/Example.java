package lesson1to41.lesson25static;

public class Example {
    static int i = 5;
    int j;
    static {
        i++;
        System.out.println("Static init");
    }
    {
        System.out.println("init");
    }
    Example(){
        System.out.println("const");
    }
    static void method(){
        int x = 10;
        System.out.println(x);
        i++;
        System.out.println("static method");
    }

    public static void main(String[] args) {
        System.out.println(Example.i);
        Example.method();
        System.out.println(Example.i);
        new Example();
        new Example();
    }
    //static блок
    // констр
    //4
    //3
    //текст
    //return int;
}
