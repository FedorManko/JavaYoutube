package properties;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Prop {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("car", "bmw");
        System.out.println(properties.getProperty("car"));
        //FileOutputStream fileOutputStream = new FileOutputStream("fedor");
        //properties.store(fileOutputStream, "Fedor");
        FileInputStream fileInputStream = new FileInputStream("fedor");
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("age"));
    }
}
