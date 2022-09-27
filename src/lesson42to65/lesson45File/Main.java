package lesson42to65.lesson45File;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Фёдор\\IdeaProjects\\JavaYoutube\\src\\lesson42\\lesson45File\\foka.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        if(file.isDirectory()){
            System.out.println("dir");
        } else if(file.isFile()){
            System.out.println("file");
        }
        FileWriter fileWriter = new FileWriter(file);
//        fileWriter.write("Foka");
//        fileWriter.flush();
//        fileWriter.close();
        FileReader fileReader = new FileReader(file);
//        char[] chars = new char[20];
//        fileReader.read(chars);
//        System.out.println(chars);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Fedor Manko");
        bufferedWriter.newLine();
        bufferedWriter.write("Wow");
        bufferedWriter.flush();
        bufferedWriter.close();
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready())
        System.out.println(bufferedReader.readLine());
        InputStream inputStream = System.in;
        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(inputStream));
        System.out.println(bufferedReader1.readLine());
    }
}
