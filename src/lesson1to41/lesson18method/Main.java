package lesson1to41.lesson18method;

public class Main {
    void show(){

    }

    public static void main(String[] args) {
        NewMain newMain = new NewMain();
        NewMain.count(10, false, new int[]{2,5}, "Fedor", "Manko");
        newMain.show();
        System.out.println(NewMain.y);
        System.out.println(NewMain.res());
    }
}
