package studentpractice.reader;

import studentpractice.dao.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MyReader {
    private static final List<Student> STUDENT_LIST =  new ArrayList<>();
    public List<Student> readStudent(){
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Фёдор\\IdeaProjects\\JavaYoutube\\src\\studentpractice\\info\\students.txt"))){
            while (bufferedReader.ready()){
                String[] strings = bufferedReader.readLine().split(" ");
                STUDENT_LIST.add(new Student(strings[0],Integer.parseInt(strings[1]), Double.parseDouble(strings[2]), strings[3]));
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return STUDENT_LIST;
    }
}
