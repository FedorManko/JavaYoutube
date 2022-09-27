package lesson42to65.lesson49Collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Collection");
        Collection<String> collection = new ArrayList();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.remove("2");
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (String ele:collection) {
            System.out.println(ele);
        }
        System.out.println("List");
        List list = Collections.EMPTY_LIST;
        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.set(1,"100");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
        System.out.println(stringList.get(2));
        System.out.println("Queue");
        Queue<String> strings = new PriorityQueue<>();
        strings.add("20");
        strings.add("21");
        strings.offer("23");
        Iterator<String> stringIterator = strings.iterator();
        while (stringIterator.hasNext()){
           strings.poll();
        }

        for (String elem:strings) {
            System.out.println(elem);
        }
        System.out.println(strings.size());
        System.out.println("Set");
        Set<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(200);
        integers.add(350);
        integers.add(1);
        for (int e:integers) {
            System.out.println(e);
        }
        System.out.println("Map");
        Map<String,Integer> map = new HashMap();
        map.put("Fedor", 1);
        map.put("Ilya", 2);
        Integer i = map.get("Fedor");
        System.out.println(i);
        Set<String> name =map.keySet();
        for (Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        name.forEach(System.out::println);
        Collection<String> treeSet = new TreeSet<>();
        treeSet.add("Fedor");
        treeSet.add("Naruto");
        treeSet.add("Boruto");
        System.out.println(treeSet);
    }
}
