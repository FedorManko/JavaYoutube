package lesson1to41.lesson18method;

import java.util.Arrays;

public class NewMain extends Main{
    int i;
    static int y;
    @Override
    void show() {
        super.show();
        i = 10;
        y = 22;
    }
    static void count(int x , boolean bool, int[] ints, String... s){
        y = 10;
        System.out.println(y);
        System.out.println(Arrays.toString(s));
    }
    static int res(){
        return 250;
    }
}
