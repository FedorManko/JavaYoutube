package lesson1to41.lesson19constr;

public class Ferrari extends Car{
    int speed;

    public Ferrari(int speed) {
        super("Foka");
        System.out.println("Ferrari");
        this.speed = speed;
    }

    public Ferrari(String model, int speed) {
        super(model);
        this.speed = speed;
    }

    public Ferrari(String model, int x, int speed) {
        this("Fer",200);
        System.out.println("Ferrari 3 ");
        this.speed = speed;
    }

}
