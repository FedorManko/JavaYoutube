package stream.lesson334localDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(localDate.format(dateTimeFormatter));
        LocalDate localDate1 = LocalDate.parse("20/08/1993",dateTimeFormatter);
        System.out.println(localDate1);
    }
}
