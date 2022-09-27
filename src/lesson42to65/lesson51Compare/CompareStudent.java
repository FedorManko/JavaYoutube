package lesson42to65.lesson51Compare;

import java.util.Comparator;

public class CompareStudent implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getMark()-o2.getMark();
    }
}
