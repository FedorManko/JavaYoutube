package threads.lesson68synx;

public class Main {
    public static void main(String[] args) throws Exception {
        Resource resource = new Resource();
        resource.setI(5);

        MyThread myThread = new MyThread();
        myThread.setName("one");
        myThread.setResource(resource);
        MyThread myThread1 = new MyThread();
        myThread1.setResource(resource);
        myThread.start();
        myThread1.start();
        myThread.join();
        myThread1.join();
        System.out.println(resource.getI());
    }
}
class MyThread extends Thread{
    Resource resource;

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.changeI();
    }
}
class Resource{
   private int i;

    public int getI() {
        return i;
    }

    public synchronized void setI(int i) {
        this.i = i;
    }

    public  void changeI(){
        synchronized (this){
            int i = this.i;
            if(Thread.currentThread().getName().equals("one")){
                Thread.yield();
            }
            i++;
            this.i = i;
        }

    }
}