package lesson42to65.lesson59clone;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyObj myObj = new MyObj();
        myObj.i = 1;
        NewObj newObj = new NewObj();
        newObj.y = 3;
        myObj.newObj = newObj;
        MyObj myObj1 = myObj.clone();
        myObj1.i =2;
        System.out.println(myObj.i);
        myObj1.newObj.y = 4;
        System.out.println(myObj.newObj.y);
    }
}
class MyObj implements Cloneable{
    int i;
    NewObj newObj;

    @Override
    protected MyObj clone() throws CloneNotSupportedException {
        MyObj myObj = (MyObj) super.clone();
        myObj.newObj = newObj.clone();
        return myObj;
    }

}
class NewObj implements Cloneable{
    int y;

    @Override
    protected NewObj clone() throws CloneNotSupportedException {
        return (NewObj) super.clone();
    }
}
