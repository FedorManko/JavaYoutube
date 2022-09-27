package threads.lesson68synx.exmaple;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Ship ship = new Ship();
        Ship ship1 = new Ship();
        Port port = new Port();
        ship.setPort(port);
        ship1.setPort(port);
        ship.start();
        ship1.start();
        ship.join();
        ship1.join();
        System.out.println(port.arrivedShips);
    }
}

class Ship extends Thread{
    Port port;

    public void setPort(Port port) {
        this.port = port;
    }

    @Override
    public void run() {
        port.increaseArrivedShips();
    }
}
class Port {
    int arrivedShips;
    public synchronized   void increaseArrivedShips(){
        arrivedShips++;
    }
}