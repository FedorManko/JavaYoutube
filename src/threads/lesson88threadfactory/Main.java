package threads.lesson88threadfactory;

import java.util.concurrent.ThreadFactory;

public class Main {
    public static void main(String[] args) {
        ThreadFactory  threadFactory = r -> {
            Thread thread = new Thread(r);
            thread.setPriority(Thread.MAX_PRIORITY);
            return thread;
        };
        threadFactory.newThread(new MyRun()).start();
    }
    static class MyRun implements Runnable{
        @Override
        public void run() {
            System.out.println(1);
        }
    }
}
