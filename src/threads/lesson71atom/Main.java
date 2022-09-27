package threads.lesson71atom;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    int i;
    Integer I;
    Double D;
    double d;
    static AtomicInteger atomicInteger = new AtomicInteger(0);
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            new MyThread().start();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(atomicInteger);

    }
    static class MyThread extends Thread{
        @Override
        public void run() {
            atomicInteger.incrementAndGet();
        }
    }
}
