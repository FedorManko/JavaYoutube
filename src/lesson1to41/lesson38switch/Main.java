package lesson1to41.lesson38switch;

public class Main {
    public static void main(String[] args) {
        int i = 30;
        String str ="A";
        switch (i){
            case 1:
                System.out.println("1");break;
            case 2:
                System.out.println("2");break;
            case 3:
                System.out.println("3");
            default:
                System.out.println("default");
            case 4:
                System.out.println("4");
            case 5:
                System.out.println("5"); break;
        }
        switch (str){
            case "A":
                System.out.println("A");break;
            case "B":
                System.out.println("B");break;
            default:
                System.out.println("cC");
        }
        DaysOfTheWeek daysOfTheWeek = DaysOfTheWeek.Friday;
        switch (daysOfTheWeek){
            case Monday:
                System.out.println("Monday"); break;
            case Friday:
                System.out.println("Friday") ; break;
            default:
                System.out.println("Wrong");
        }
    }
    enum DaysOfTheWeek{
        Monday, Tuesday, Wednesday, Thursday, Friday, Sunday, Saturday
    }
}
