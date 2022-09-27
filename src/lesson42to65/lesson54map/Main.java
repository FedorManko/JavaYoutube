package lesson42to65.lesson54map;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        Map<String, Integer> stringIntegerMap1 = new Hashtable<>();
        Map<String, Integer> stringIntegerMap2 = new LinkedHashMap<>();
        Map<String, Integer> stringIntegerMap3 = new TreeMap<>();
        stringIntegerMap.put("Fedor", 10);
        stringIntegerMap.put("Boris", 5);
        stringIntegerMap.put("Angel", 200);
        System.out.println(stringIntegerMap);
        stringIntegerMap2.put("Fedor", 10);
        stringIntegerMap2.put("Boris", 5);
        stringIntegerMap2.put("Angel", 200);
        System.out.println(stringIntegerMap2);
        System.out.println(stringIntegerMap.get("Fedor"));
        Set<String> stringSet = stringIntegerMap.keySet();
        System.out.println(stringSet);
        stringIntegerMap3.put("Fedor", 10);
        stringIntegerMap3.put("Boris", -5);
        stringIntegerMap3.put("Angel", 200);
        System.out.println(stringIntegerMap3);

    }
}
