package stream.lesson328;

import java.util.Comparator;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Run run = x -> System.out.println(x);
        int z = Stream.of(1, 5).filter(x -> x > 4).findAny().get();
        Stream.of("Hello", "Foka").map(String::length).sorted().forEach(System.out::println);
        System.out.println(z);
        System.out.println(Stream.of(1, -4, 3).max(Integer::compareTo).get());
        Set<String> stringsSet = Stream.of("Hello", "Foka", "Fedor").filter(s -> s.startsWith("F")).findFirst().stream().collect(Collectors.toSet());
        System.out.println(stringsSet);
        Optional<String> optionalS = get0();
        Optional<String> optionalS1 = Optional.empty();
        if(optionalS.isPresent()){
            System.out.println(optionalS.get());
        }

        IntStream stream = Stream.of(1,10,1).mapToInt(x ->x);
        System.out.println(stream.average().getAsDouble());

    }
     static Optional get0(){
        if(false)
            return Optional.of("Hello");
        return Optional.empty();
    }
}
interface Run<T>{
    void run(T t);
}
