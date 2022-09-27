package lesson42to65.lesson56generic;

public class Gener <T extends Human,U extends String>{
    T i;
    U u;
   <Z> T method(T t, U u,Z z){
        return t;
    }

    public static void main(String[] args) {
        Gener<Man,String > manGener = new Gener<>();
        manGener.method(new Man(),"F",new Gener());
    }

}
class Human{

}
class Man extends Human {

}
