package lesson42to65.lesson65consoleSacnner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sc {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        String s = "";
//        while (!s.equals("stop")){
//            s = scanner.nextLine();
//            System.out.println(s);
//        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s1 ="";
        while (!s1.equals("stop")){
             s1 = bufferedReader.readLine();
            System.out.println(s1);
        }
    }
}
