package lesson1to41.lesson21enum;

public class Main {
    public static void main(String[] args) {
        int daysOfTheWeekNum = DaysOfTheWeek.Friday.ordinal();
        DaysOfTheWeek daysOfTheWeek1 = DaysOfTheWeek.valueOf("Friday");
        System.out.println(daysOfTheWeekNum);
        DaysOfTheWeek[] daysOfTheWeeks = DaysOfTheWeek.values();
        int num = DaysOfTheWeek.Friday.getNum();
        System.out.println(daysOfTheWeek1.getDayClass());
    }

}

