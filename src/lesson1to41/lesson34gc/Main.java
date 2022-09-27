package lesson1to41.lesson34gc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      // Date date = method();
      // date = null;
      // System.gc();
       method2();
    }
    private static Date method(){

        Date date = new Date();
        Date date1 = date;
        System.out.println(date);
        return date1;
    }

    private static void method2(){
        Runtime runtime = Runtime.getRuntime();
        System.out.println("total memory before:  " + runtime.totalMemory());
        System.out.println("free memory before:  " + runtime.freeMemory());
        List<Date> dateList = new ArrayList<>();
        for (int i = 0; i < 1_000_000_00; i++) {
            Date date = new Date();
           // date = null;
            dateList.add(date);
        }
        dateList = null;
        System.out.println("total memory after:  " + runtime.totalMemory());
        System.out.println("free memory after:  " + runtime.freeMemory());
        System.gc();
        System.out.println("total memory after gc:  " + runtime.totalMemory());
        System.out.println("free memory after gc:  " + runtime.freeMemory());

    }
}
