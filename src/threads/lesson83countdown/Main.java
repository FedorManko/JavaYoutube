package threads.lesson83countdown;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);
       new Work(countDownLatch);
        new Work(countDownLatch);
        new Work(countDownLatch);
        countDownLatch.await();
        System.out.println("All jobs done");
    }
}
class Work extends Thread{
    CountDownLatch countDownLatch;

    public Work(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
        this.start();
    }

    @Override
    public void run() {
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work is done");
        countDownLatch.countDown();
    }
}
