package stream.lesson339collect;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        List<String> list = new ArrayList<>();
        Set<String> stringSet = new HashSet<>();
        Queue<Integer> queue = new PriorityQueue<>();
        Map<String,Integer> stringIntegerMap;
        collection.add("one");
        collection.add("two");
        System.out.println(collection.size());
        collection.remove("one");
        System.out.println(collection.contains("one"));
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        for (String s:collection) {
            System.out.println(s);
        }
        list.add("one");
        System.out.println(list.get(0));
        stringSet.add("one");
        stringSet.add("one");
        System.out.println(stringSet.size());
        queue.add(1);
        queue.poll();
        queue.peek();
    }
}
