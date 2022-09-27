package proektpatterns.builder;

public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilderImpl().setAge(28).setSalary(1000.2).setName("Fedor").build();
        System.out.println(person);
        PersonBuilder personBuilder = new PersonBuilderImpl();
        personBuilder.setName("Fedor");
    }
}
class Person{
    private String name;
    private int age;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
interface PersonBuilder{
    PersonBuilder setName(String name);
    PersonBuilder setAge (int age);
    PersonBuilder setSalary(double salary);
    Person build();
}
class PersonBuilderImpl implements PersonBuilder{
    private Person person = new Person();
    @Override
    public PersonBuilder setName(String name) {
        person.setName(name);
        return this;
    }

    @Override
    public PersonBuilder setAge(int age) {
        person.setAge(age);
        return this;
    }

    @Override
    public PersonBuilder setSalary(double salary) {
        person.setSalary(salary);
        return this;
    }

    @Override
    public Person build() {
        return person;
    }
}