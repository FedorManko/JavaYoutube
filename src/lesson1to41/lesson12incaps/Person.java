package lesson1to41.lesson12incaps;

public class Person {
    private String name = "Max";
    private boolean blonde;

    public String getName() {
        return "Mr " + name ;
    }
    public void setName(String name){
        this.name = name;
    }

    public boolean isBlonde() {
        return blonde;
    }

    public void setBlonde(boolean blonde) {
        this.blonde = blonde;
    }
}
