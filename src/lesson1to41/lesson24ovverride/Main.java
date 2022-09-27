package lesson1to41.lesson24ovverride;

public class Main {
    public static void main(String[] args) throws Exception {
        Parent parent = new Parent();
        Parent child = new Child();
        System.out.println(parent.method());
        System.out.println(child.method());
        parent.show();
        child.show();
        System.out.println(parent.run());
        System.out.println(child.run());
    }
}
