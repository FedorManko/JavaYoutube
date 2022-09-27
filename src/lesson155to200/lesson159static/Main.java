package lesson155to200.lesson159static;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main {
    static  int i;
    static int[] a = new int[3];
    static int getI() throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("Foka");
        return 5;
    }
    static {
        a[0] = 5;
        try {
            i = getI();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

    }
    static class Foka{

    }
    static interface Fedor{

    }
}
//static class Foka{
//
//}
//static interface Fedor{
//
//}
