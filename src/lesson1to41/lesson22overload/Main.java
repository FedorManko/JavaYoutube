package lesson1to41.lesson22overload;

import java.io.IOException;

public class Main {
    public  int addTwoDigit(int a, int b) throws IndexOutOfBoundsException{
        return a + b;
    }
    public  double addTwoDigit(double a, double b) throws IOException {
        return a + b;
    }
    protected  int addTwoDigit(int a, int b, int x) throws OutOfMemoryError{
        return a + b + x;
    }
    public  void addTwoDigit(){
        System.out.println("Hello");
    }


    public static void main(String[] args) throws IOException {
        MainChild main = new MainChild();
        System.out.println(main.addTwoDigit(2,5));
        System.out.println(main.addTwoDigit(2,5, 10));
        System.out.println(main.addTwoDigit(2.2,3.6));
        main.addTwoDigit();

    }

}
class MainChild extends Main{

}
