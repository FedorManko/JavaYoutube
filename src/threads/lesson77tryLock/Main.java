package threads.lesson77tryLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    static Lock lock = new ReentrantLock();
    public static void main(String[] args) {
        new MyThread().start();
        new Thread2().start();
    }
    static class MyThread extends Thread{
        @Override
        public void run() {
            lock.lock();
            System.out.println(getName() + " start working");
            try {
                sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + " stop working");
            lock.unlock();
            System.out.println(getName() + " lock is released");
        }
    }
    static class Thread2 extends Thread{
        @Override
        public void run() {
            System.out.println(getName() + " begin working");
            while (true){
                if(lock.tryLock()){
                    System.out.println(getName() + " working");
                    break;
                } else {
                    System.out.println(getName() + " waiting");
                }
            }

        }
    }
}
