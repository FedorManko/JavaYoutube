package lesson42to65.lesson59clone;

public class Human implements Cloneable {
    int age;
    Student student;

    public int getAge() {
        return age;
    }

    public Student getStudent() {
        return student;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Human human1 = new Human();
        human1.age = 10;
        Student student = new Student();
        student.name = "Fedor";
        human1.student = student;
        Human human2 = human1.clone();
        human2.age = 5;
        human2.student.name = "Foka";
        System.out.println(human2.age);
        System.out.println(human2.student.getName());
    }

    @Override
    protected Human clone() throws CloneNotSupportedException {
        return (Human)super.clone();
//       Human human = (Human) super.clone();
//       human.student = student.clone();
//       return human;
    }
}
class Student implements Cloneable{
    String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}
