package threads.lesson69staticsymx;

public class Main {
    public static void main(String[] args) throws Exception {
        Resource resource = new Resource();
        Resource.i = 5;
        MyThread myThread = new MyThread();
        myThread.setResource(resource);
        myThread.setName("one");
        MyThread myThread1 = new MyThread();
        myThread1.setResource(resource);
        myThread.start();
        myThread1.start();
        myThread.join();
        myThread1.join();
        System.out.println(Resource.i);
        System.out.println(resource.j);
    }
}

class MyThread extends Thread{
    Resource resource;
    @Override
    public void run() {
        Resource.changeStaticI();
        resource.changeI();
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }
}
class Resource{
    static int i;
    int j;



    public    static void changeStaticI() {
        synchronized (Resource.class) {
        int i = Resource.i;
        if (Thread.currentThread().getName().equals("one")) {
            Thread.yield();
        }
        i++;
        Resource.i = i;
    }
    }
    public  void changeI(){
        synchronized (this){
            int j = this.j;
            if(Thread.currentThread().getName().equals("one")){
                Thread.yield();
            }
            j++;
            this.j = j;
        }

    }
}
