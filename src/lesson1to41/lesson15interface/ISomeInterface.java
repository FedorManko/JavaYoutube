package lesson1to41.lesson15interface;

public  interface ISomeInterface extends IOtherInterface {
    public static final int SOME_VARIABLE = 5;
    public abstract void addTwoDigit(int a, int b);
}
interface IOtherInterface{
    void someMethod();

}
interface BounceAble{
    void bounce();
}
class Example implements ISomeInterface,BounceAble{
    @Override
    public void addTwoDigit(int a, int b) {
        a = SOME_VARIABLE;
    }

    @Override
    public void someMethod() {

    }

    @Override
    public void bounce() {

    }

}