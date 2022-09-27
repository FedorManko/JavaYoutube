package lesson155to200.lesson165interface;

public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Cat.roar();
        ChildTiger childTiger = new ChildTiger();
        childTiger.j = 10;
        childTiger.sleep();
    }
}
abstract interface Animal{
public final static int i =5;
  public abstract void eat();
  public static class Ab{

  }
  interface MyInner{}

}
interface Cat extends Animal{
    void run();
    default void swim(){
        System.out.println("swim");
    }
    static void roar(){
        System.out.println("Roar");
    }
}
class Tiger implements Animal, Cat{
    int j;
    @Override
    public void eat() {

    }

    @Override
    public void run() {

    }
     void sleep(){
        System.out.println("sleep");
    }
    static void seat(){
        System.out.println("seat");
    }
}
class ChildTiger extends Tiger{
    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    protected void sleep() {
        super.sleep();
    }
}
