package lesson42to65.lesson43assert;

public class Main {
    public static void main(String[] args) {
    new Main().someMethod(-10);
    }
    private void someMethod(int a){
        assert (a > 0);
        System.out.println(a);
    }
}
