package lesson1to41.lesson14abstrfinal;

public class ExampleClass {
}
abstract strictfp class Car extends ExampleClass{
    int speed;
    abstract void run();
    void stop(){
        speed = 0;
    }
}
class Ferrari extends Car{

    @Override
    void run() {
        speed = 25;
    }

    @Override
    void stop() {
        super.stop();
    }
}
final strictfp class MyFinal{

}
