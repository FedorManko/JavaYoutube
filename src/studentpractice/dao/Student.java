package studentpractice.dao;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {
    private String name;
    private int age;
    private double averageMark;
    private String country;

    public Student(String name, int age, double averageMark, String country) {
        this.name = name;
        this.age = age;
        this.averageMark = averageMark;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age && Double.compare(student.averageMark, averageMark) == 0 && Objects.equals(name, student.name) && Objects.equals(country, student.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, averageMark, country);
    }

    @Override
    public String toString() {
        return String.format(" %s | Name: %s | Age: %d | Mark: %f | Country: %s |",
                this.getClass().getSimpleName(), name, age, averageMark, country);
    }
}
