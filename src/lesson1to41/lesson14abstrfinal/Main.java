package lesson1to41.lesson14abstrfinal;

public class Main {
    public static void main(String[] args) {
        ExampleClass exampleClass = new ExampleClass();
        Car car = new Ferrari();
        car.run();
        System.out.println(car.speed);
        car.stop();
        System.out.println(car.speed);
    }
}
