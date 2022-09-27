package lesson42to65.lesson44StringBuilder;

public class Main {
    public static void main(String[] args) {
        String s = new String("abc");
        String s2 = s.concat("def");
        System.out.println(s2);
        s.toUpperCase();
        System.out.println(s);
        StringBuilder stringBuilder = new StringBuilder("Foka");
        System.out.println(stringBuilder.append("Leroi"));
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.charAt(2));
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder.replace(4,6, "Manko"));
    }
}
