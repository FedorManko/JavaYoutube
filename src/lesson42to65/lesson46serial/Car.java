package lesson42to65.lesson46serial;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Car implements Serializable {
    private static final String NAME_OF_THE_FILE = "C:\\Users\\Фёдор\\IdeaProjects\\JavaYoutube\\src\\lesson42\\lesson46serial\\text.txt";
    private static final String NAME_OF_THE_FILE2 = "C:\\Users\\Фёдор\\IdeaProjects\\JavaYoutube\\src\\lesson42\\lesson46serial\\text2.txt";
    private String model;
    private Calendar calendar;

    public Car(String model, Calendar calendar) {
        this.model = model;
        this.calendar = calendar;
    }

    public String getModel() {
        return model;
    }

    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\Фёдор\\IdeaProjects\\JavaYoutube\\src\\lesson42\\lesson46serial\\car.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        Car car = new Car("BMW",Calendar.getInstance());
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream(file));
        objectOutputStream.writeObject(car);
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        Car newCar  = (Car)objectInputStream.readObject();
        System.out.println(newCar.getModel());
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();

        System.out.println(dateFormat.format(newCar.calendar.getTime()));
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(NAME_OF_THE_FILE))
        ){
            bufferedWriter.write("Fedor");
            bufferedWriter.newLine();
            bufferedWriter.append("Manko");
            char [] chars = new char[]{'A', 'B'};
            bufferedWriter.write(chars);


        }
        BufferedReader bufferedReader = new BufferedReader(new FileReader(NAME_OF_THE_FILE));
        while (bufferedReader.ready())
        System.out.println(bufferedReader.readLine());
        FileInputStream fileInputStream = new FileInputStream(NAME_OF_THE_FILE2);
        StringBuilder stringBuilder = new StringBuilder();
        while (fileInputStream.available() != 0){
            char c = (char) fileInputStream.read();
            stringBuilder.append(c);
        }
        fileInputStream.close();
        System.out.println(stringBuilder);
        FileOutputStream fileOutputStream = new FileOutputStream(NAME_OF_THE_FILE2, true);
        byte[] b = {83,80,81,82};
        fileOutputStream.write(b);
    }
}
