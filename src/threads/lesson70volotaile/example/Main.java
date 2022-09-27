package threads.lesson70volotaile.example;

public class Main {
    volatile static int numOfShips;
    public static void main(String[] args) throws InterruptedException {
        ShipArrival shipArrival = new ShipArrival();
        shipArrival.start();
        ShipDeparture shipDeparture = new ShipDeparture();
        shipDeparture.start();
        shipArrival.join();
        shipDeparture.join();
        System.out.println(numOfShips);
    }


}
class ShipArrival extends Thread{
    @Override
    public void run() {
        while (Main.numOfShips < 10){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Прибыл " + (++Main.numOfShips) + "корабль");
        }
    }
}
class ShipDeparture extends Thread{
    @Override
    public void run() {
        int localNum = Main.numOfShips;
        while (Main.numOfShips < 10) {
            if (localNum != Main.numOfShips) {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Убыл " + Main.numOfShips + "корабль");
                localNum = Main.numOfShips;
            }
        }
    }
}
