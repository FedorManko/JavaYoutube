package proektpatterns.bridge;

public class Bridge {
    public static void main(String[] args) {
        Vehicle vehicle = new Car(new Toyota());
        vehicle.drive();
        Vehicle vehicle1 = new Truck(new Audi());
        vehicle1.drive();
        Vehicle vehicle2 = new Truck(new Mercedes());
        vehicle2.drive();
    }

}
abstract class Vehicle{
    private Model model;

    public Model getModel() {
        return model;
    }

    public Vehicle(Model model) {
        this.model = model;
    }

    abstract void drive();
}
class Car extends Vehicle {
    public Car(Model model) {
        super(model);
    }

    @Override
    void drive() {
        getModel().drive("drive car");
    }
}
class Truck extends Vehicle {
    public Truck(Model model) {
        super(model);
    }

    @Override
    void drive() {
        getModel().drive("drive truck");
    }
}
interface Model{
    void drive(String str);
}
class Audi implements Model{
    @Override
    public void drive(String str) {
        System.out.println(str + " audi") ;
    }
}
class Toyota implements Model{
    @Override
    public void drive(String str) {
        System.out.println(str + " toyota") ;
    }
}
class Mercedes implements Model{
    @Override
    public void drive(String str) {
        System.out.println(str + " mercedes") ;
    }
}