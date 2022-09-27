package stream.lesson332collectors;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Set<String> stringSet = Stream.of("Bob","Alex","Mike").collect(Collectors.toCollection(TreeSet::new));
        System.out.println(stringSet);
        int z = Stream.of(1, 2, -10, 5).max(Comparator.comparingInt(x -> x)).get();
        System.out.println(z);
        int y = Stream.of(1,5,12).collect(Collectors.averagingInt(Integer::intValue)).intValue();
        System.out.println(y);
    }
}
