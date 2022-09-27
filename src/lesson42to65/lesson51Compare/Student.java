package lesson42to65.lesson51Compare;

import java.util.Set;
import java.util.TreeSet;

public class Student {

    private int mark;

    public Student(int mark) {
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "mark=" + mark +
                '}';
    }

    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>(new CompareStudent());
        students.add(new Student(10));
        students.add(new Student(2));
        students.add(new Student(8));
        System.out.println(students);
    }
}
