package lesson1to41.lesson19constr;

public class Car {
    String model;
    int x = 22;
    public Car(){
        System.out.println("Car");
    }

    public Car(String model) {
        System.out.println("String Car");
        this.model = model;
    }

    public Car(String model, int x) {
        this.model = model;
        this.x = x;
    }
}
