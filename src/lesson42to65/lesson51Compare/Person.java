package lesson42to65.lesson51Compare;

import java.util.Set;
import java.util.TreeSet;

public class Person implements Comparable<Person> {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Set<Person> set = new TreeSet<>();
        set.add(new Person(20,"Fedor"));
        set.add(new Person(21,"Boris"));
        set.add(new Person(22,"Mark"));
        set.add(new Person(30,"Andy"));
        System.out.println(set);
    }

    @Override
    public int compareTo(Person o) {
        return o.name.compareTo(this.name);
    }
}
