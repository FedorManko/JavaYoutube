package lesson1to41.lesson39while;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,5,8};
        int i = 0;
        while (i > arr.length){
            System.out.println(arr[i]);
            i++;
        }
        i  = 0;
        do {
            System.out.println("do");
            System.out.println(arr[i]);
            i++;
        } while (i > arr.length);
    }
}
