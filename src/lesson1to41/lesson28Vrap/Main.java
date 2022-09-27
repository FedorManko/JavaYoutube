package lesson1to41.lesson28Vrap;

public class Main {
    public static void main(String[] args) {
        int x = Integer.parseInt("5");
        Integer y = Integer.valueOf(5);
        short z = y.shortValue();
        String s = "String";
        String s2 = "String";
        String s3 = new String("String");
        Object o1 = new Object();
        Object o2 = new Object();
        System.out.println(o1 == o2);
        System.out.println(o1.equals(o2));
        System.out.println(s == s2);
        System.out.println(s == s3);
        System.out.println(s.equals(s2));
        System.out.println(s.equals(s3));
        Byte i = 127;
        Byte j = 127;
        System.out.println(i.equals(j));
        System.out.println(i == j);
    }
}
