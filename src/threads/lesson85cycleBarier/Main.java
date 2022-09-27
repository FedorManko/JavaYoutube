package threads.lesson85cycleBarier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Main {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Run());
        new SportsMen(cyclicBarrier);
        new SportsMen(cyclicBarrier);
        new SportsMen(cyclicBarrier);
    }
    static class Run extends Thread{
        CyclicBarrier cyclicBarrier;

        @Override
        public void run() {
            System.out.println("Run is begin");
        }
    }
    static class SportsMen extends Thread{
        CyclicBarrier cyclicBarrier;

        public SportsMen(CyclicBarrier cyclicBarrier) {
            this.cyclicBarrier = cyclicBarrier;
            this.start();
        }

        @Override
        public void run() {
            try {
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
}
