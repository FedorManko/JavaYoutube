package lesson42to65.lesson51Compare;

import java.util.Set;
import java.util.TreeSet;

public class Car {
    String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Set<Car> carSet = new TreeSet<>();;
    }
}
