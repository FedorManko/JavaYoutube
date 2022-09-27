package lesson1to41.lesson11polimorf;

public class Main {
    void useCar(Car car){
        car.driving();
        System.out.println(car.getNumOfSeats());
    }
    public static void main(String[] args) {
        Main main = new Main();
        Car car = new Car();
        main.useCar(car);
        Car toyota = new Toyota();
        System.out.println(toyota.getNumOfSeats());
    }
}
