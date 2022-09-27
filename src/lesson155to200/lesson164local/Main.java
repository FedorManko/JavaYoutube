package lesson155to200.lesson164local;

public class Main {
    static int i = 5;
    int j = 6;
    public static void main(String[] args) {
    }
    void method(){

        class Local{
            static int q = 10;
        }
        Local local = new Local();
    }

}
