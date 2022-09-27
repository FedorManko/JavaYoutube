package threads.lesson84Excanger;

import java.util.concurrent.Exchanger;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Exchanger<String> stringExchanger = new Exchanger<>();
        new Mike(stringExchanger);
        new Anket(stringExchanger);
    }
    static class Mike extends Thread{
        Exchanger<String> exchanger;

        public Mike(Exchanger<String> exchanger) {
            this.exchanger = exchanger;
            this.start();
        }

        @Override
        public void run() {
            try {
                exchanger.exchange("Hi my name is Mike");
                sleep(3000);
                exchanger.exchange("I'm 20 years old");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
    static class Anket extends Thread{
        Exchanger<String> exchanger;

        public Anket(Exchanger<String> exchanger) {
            this.exchanger = exchanger;
            this.start();
        }

        @Override
        public void run() {
            try {
                System.out.println(exchanger.exchange(null));
                System.out.println(exchanger.exchange(null));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
