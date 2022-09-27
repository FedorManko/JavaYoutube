package studentpractice.action;

import studentpractice.dao.Student;

import java.io.*;
import java.util.Comparator;
import java.util.List;

public class MyAction {
    public static double maxMark(List<Student> studentList){
        return studentList.stream().max(Comparator.comparingDouble(Student::getAverageMark)).get().getAverageMark();
    }
    public static List<Student> sortByMark(List<Student> studentList){
        return studentList.stream().filter(student -> student.getAverageMark() > 7.5).toList();
    }
    public static List<String> getAllNames(List<Student> studentList){
        return studentList.stream().map(Student::getName).toList();
    }
    public static void print(List<String> studentList){
        System.out.println(studentList);
    }
    public static void deleteStudentByName(List<Student> studentList,Student student){
        studentList.remove(student);
    }
    public static void printToFile(List<Student> studentList){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Фёдор\\IdeaProjects\\JavaYoutube\\src\\studentpractice\\info\\students2.txt"))){
            for (int i = 0; i < studentList.size(); i++) {
                bufferedWriter.write(studentList.get(i).toString());
                bufferedWriter.write("\n");
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void increaseAge(List<Student> studentList){
         studentList.forEach(student -> student.setAge(20));
    }
    public static void seriaz(List<Student> studentList){
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("C:\\Users\\Фёдор\\IdeaProjects\\JavaYoutube\\src\\studentpractice\\info\\studentsSeri.txt"))){
            objectOutputStream.writeObject(studentList);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
