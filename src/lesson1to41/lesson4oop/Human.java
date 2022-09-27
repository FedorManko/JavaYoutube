package lesson1to41.lesson4oop;

public class Human {
    int age;
    double weight;
    public static void main(String[] args) {
        Human human = new Human();
        human.byBread();
        human.byMilk();
        human.birthday();
        System.out.println(human.age);
    }
    void byMilk(){
        System.out.println("Buy Milk");
    }
    void byBread(){
        System.out.println("Buy Bread");
    }
    void birthday(){
        age++;
    }
}
