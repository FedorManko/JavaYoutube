package studentpractice.start;

import studentpractice.action.MyAction;
import studentpractice.dao.Student;
import studentpractice.reader.MyReader;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyReader myReader = new MyReader();
        List<Student> studentList = myReader.readStudent();
        System.out.println(MyAction.maxMark(studentList));
        System.out.println(MyAction.sortByMark(studentList));
        MyAction.print(MyAction.getAllNames(studentList));
        MyAction.deleteStudentByName(studentList,studentList.get(1));
        MyAction.print(MyAction.getAllNames(studentList));
        MyAction.printToFile(studentList);
        MyAction.increaseAge(studentList);
        System.out.println(studentList);
        MyAction.seriaz(studentList);
    }
}
