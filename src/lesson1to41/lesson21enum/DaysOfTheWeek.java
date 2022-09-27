package lesson1to41.lesson21enum;

public enum DaysOfTheWeek {
    Monday(1),Tuesday(2),Wednesday(3),Thursday(4),Friday(5){
        @Override
        public String getDayClass() {
            return "B";
        }
    }, Sunday(6), Saturday(7);
    int num;
    String dayClass = "A";
    DaysOfTheWeek(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
    public String getDayClass(){
        return dayClass;
    }
}
