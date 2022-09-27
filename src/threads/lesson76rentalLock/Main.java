package threads.lesson76rentalLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Resource resource = new Resource();
        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();
        myThread.resource =resource;
        myThread1.resource = resource;
        myThread.start();
        myThread1.start();
        myThread.join();
        myThread1.join();
        System.out.println(resource.i);
        System.out.println(resource.j);
    }
}
class MyThread extends Thread{
    Resource resource;
    @Override
    public void run() {
        resource.changeI();
        resource.changeJ();
    }
}
class Resource {
    int i;
    int j = 10;
    Lock lock = new ReentrantLock();
    public void changeI(){
        lock.lock();
        i++;

    }
    public void changeJ(){
        j++;
        lock.unlock();
    }
}
