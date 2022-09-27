package lesson1to41.lesson35operators;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println(a % b);
        int c = 5;
        c *=6;
        System.out.println(c);
        System.out.println(5 == 5);
        int i = 6;
        double z = 6.10;
        System.out.println(i != z);
        Object o = new Object();
        Object o1 = new Object();
        System.out.println(o == o1);
        Main main = new Main();
        System.out.println(main instanceof List);
        String s = "bla";
        System.out.println(s + "hoho");
        System.out.println("" + 5 + 6);
        System.out.println(5 + 6 + "");
        int y = 5;
        System.out.println(y++ + ++y);
        System.out.println(y);
        int x = (10 > 6)? 8 : 2;
        System.out.println(x);
        System.out.println(5 < 4 & returnBool());
        System.out.println(!true);
        System.out.println(true ^ true);
    }
    private static boolean returnBool(){
        System.out.println("returnBool");
        return true;
    }
}
