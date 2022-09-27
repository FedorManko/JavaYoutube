package threads.lesson75waitexample.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
   final static List<Ship> list = Collections.synchronizedList(new ArrayList<>());
    public static void main(String[] args) throws InterruptedException {
        Ship ship = new Ship("Titanic");
        Port port = new Port();
        port.ship = ship;
        ship.start();
        Thread.sleep(500);
        port.start();
    }
}
class Ship extends Thread{


    public Ship(String name) {
        setName(name);
    }

    @Override
    public void run() {
            synchronized (Port.class){
                    System.out.println("Корабль " +getName() +" в порту");
                try {
                    Port.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

    }
}
class Port extends Thread{
    Ship ship;
    @Override
    public void run() {

        synchronized (this) {

                System.out.println("Корабль " + ship.getName() + " в ремонте");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            notify();
            System.out.println("Корабль " + ship.getName() + " уплыл");

        }
    }
}
