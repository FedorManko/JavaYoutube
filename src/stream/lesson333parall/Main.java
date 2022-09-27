package stream.lesson333parall;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("Fedors", "Foka", "Leroi"));
        Optional<Integer> optionalInteger = Optional.empty();
        int z = strings.stream().parallel().map(String::length).filter(integer -> integer % 2 == 0).max(Comparator.comparingInt(Integer::intValue)).get();
        System.out.println(z);
        String str = Stream.of("Foka","Fedor","Todoros").collect(Collectors.joining(",","{","}"));
        System.out.println(str);
        Map<Integer,Long> booleanListMap = Stream.of(1,2,1,3).collect(Collectors.groupingBy(x->x,Collectors.counting()));

    }
}
