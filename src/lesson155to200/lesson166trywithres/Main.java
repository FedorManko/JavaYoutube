package lesson155to200.lesson166trywithres;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try(Reader reader = new FileReader(new File("Foka"));
            OutputStream outputStream = new ObjectOutputStream(new FileOutputStream("G"));
            MyClass myClass = new MyClass()) {

        } catch (IOException e){
            System.out.println(e);
        }

    }
}
class MyClass implements AutoCloseable{
    @Override
    public void close() throws Exception {

    }
}
