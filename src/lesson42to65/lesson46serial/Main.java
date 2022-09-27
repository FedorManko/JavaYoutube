package lesson42to65.lesson46serial;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        UserChild user = new UserChild();
        user.lifeLevel = 55;
        user.staticField = 45;
        user.sword.level = 5;
        user.childLevel = 22;
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Фёдор\\IdeaProjects\\JavaYoutube\\src\\lesson42\\lesson46serial\\user.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
        user.staticField = 35;
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Фёдор\\IdeaProjects\\JavaYoutube\\src\\lesson42\\lesson46serial\\user.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        UserChild newUser = (UserChild)objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(newUser.lifeLevel);
        System.out.println(newUser.sword);
        System.out.println(newUser.staticField);
        System.out.println(newUser.childLevel);
    }
}
