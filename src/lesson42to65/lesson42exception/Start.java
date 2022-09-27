package lesson42to65.lesson42exception;

import java.io.File;
import java.io.IOException;
import java.net.SocketException;

public class Start {
    public static void main(String[] args) throws SocketException {
        new Start().someMethod();
    }
    void someMethod() throws SocketException {
        //throw new RuntimeException();
        File file = new File("foka.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        throw new MyException();
        //throw new SocketException();

        //throw new NumberFormatException();
    }
}
