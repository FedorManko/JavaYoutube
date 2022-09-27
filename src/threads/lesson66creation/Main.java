package threads.lesson66creation;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println(Thread.currentThread().getName());
        MyRunnable myRunnable = new MyRunnable();
        Thread myThread1 = new Thread(myRunnable);
        myThread1.start();
        new MyRun();
    }

}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 400 ; i++) {
            System.out.println("Thread name is: " + Thread.currentThread().getName() + " " + i);
        }
    }
    private static void method(){
        throw new RuntimeException();
    }
}
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 400 ; i++) {
            System.out.println("Thread name is: " + Thread.currentThread().getName() + " " + i);
        }
    }
}
class MyRun implements  Runnable{
    Thread t;

    public MyRun() {
        t = new Thread(this, "MyRun");
        t.start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
