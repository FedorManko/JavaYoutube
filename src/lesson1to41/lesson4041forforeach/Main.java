package lesson1to41.lesson4041forforeach;

public class Main {
    public static void main(String[] args) {
        int[] array = {-2,6,0};
        int i = 0;
        for (System.out.println("foka"); i < 10 && args.length == 0; System.out.println("end"), i++) {
            if (i == 6)
                continue;
            System.out.println(i);
        }
        for (int elem:array) {
            System.out.println(elem);
        }
    }
}
