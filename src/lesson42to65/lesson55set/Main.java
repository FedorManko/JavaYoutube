package lesson42to65.lesson55set;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        Set<String> stringSet1 = new LinkedHashSet<>();
        Set<String> stringSet2 = new TreeSet<>();
        stringSet.add("1");
        stringSet.add("10");
        stringSet.add("1");
        stringSet.add("2");
        stringSet.add("2");
        stringSet.removeIf(s -> s.equals("2"));
        for (String s:stringSet) {
            System.out.println(s);
        }
        List<String> list = stringSet.stream().filter(s -> s.length() >2).toList();
        stringSet.addAll(stringSet1);
        System.out.println(list);
        Iterator<String> iterator =stringSet.iterator();
    }
}
