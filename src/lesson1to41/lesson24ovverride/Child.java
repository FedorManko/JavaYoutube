package lesson1to41.lesson24ovverride;

public class Child extends Parent{
    @Override
     protected final int method () throws RuntimeException {
        return 10;
    }

    @Override
    Child run() {
        return new Child();
    }
}
