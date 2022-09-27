package lesson1to41.lesson27arr2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr[] = new int[5][3];
        System.out.println(Arrays.deepToString(arr));
        int [] array = new int[6];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int elem:array) {
            System.out.println(elem);
        }
        int [][] ar = new int[2][];
        ar[1] = new int[]{2,-2,5};

        method(ar[1]);
        byte[][] arrr = {{1,4},{3,},{7,8,-3}};
        System.out.println(Arrays.deepToString(arrr));
    }
    static void method(int[] ints){
        for (int elem:ints) {
            System.out.println(elem);
        }
    }
}
