package stream.lesson331refermethod;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.of("Fedor", "Wow").map(String::toUpperCase);
        Stream.of("Fedor","Max").map(Student::new).map(Student::getName).forEach(System.out::println);
    }

}
class Student{
    String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
