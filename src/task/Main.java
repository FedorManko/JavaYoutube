package task;

import java.util.Scanner;

public class Main {
    public static int FirstFactorial(int num) {
        System.out.println(num);
        int factorial = 1;
        for(int i = 1 ; i <=num; i++){
            factorial*=i;
        }
        return factorial;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FirstFactorial(Integer.parseInt(s.nextLine())));
    }
}
