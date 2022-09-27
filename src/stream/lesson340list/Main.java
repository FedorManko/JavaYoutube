package stream.lesson340list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("C");
        strings.add("B");
        for (String s:strings) {
            System.out.println(s);
       //     strings.remove(s);
        }
//        for (int i = 0; i < strings.size(); i++) {
//            strings.remove(i);
//        }
        Collections.sort(strings);
        for (String s:strings) {
            System.out.println(s);
        }
        String[] strings1 = new String[strings.size()];
        strings1 = strings.toArray(strings1);
        List<String> strings3 = Arrays.asList(strings1);
        List<Student> strings2 = new ArrayList<>();
        strings2.add(new Student("Foka",10 ));
        strings2.add(new Student("Fokas",11 ));
        strings2.add(new Student("Fokaf",2 ));
        Collections.sort(strings2);
        for (Student s:strings2) {
            System.out.println(s);
        }
        long l = System.currentTimeMillis();
    }
    static class Student implements Comparable{
        String name;
        int id;

        public Student(String name, int id) {
            this.name = name;
            this.id = id;
            return;
        }

        @Override
        public int compareTo(Object o) {
            return id - ((Student)o).id;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    '}';
        }
    }
}
