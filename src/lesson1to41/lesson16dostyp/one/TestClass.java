package lesson1to41.lesson16dostyp.one;

public class TestClass {
    private int i = 5;
    protected int j = 6;
     int k = 10;
    public int m = 8;

    public TestClass(){
        k = 22;
    }

}
class TestMod{
    void method(){
        TestClass testClass = new TestClass();
        System.out.println(testClass.j);
        int l = 10;
        System.out.println(l);
    }
}
