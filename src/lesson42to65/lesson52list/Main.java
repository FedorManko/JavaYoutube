package lesson42to65.lesson52list;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(55);
        List<Integer> list = new ArrayList<>(integerList);
        System.out.println(list.size());
        LinkedList<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new Vector<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(3);
        System.out.println(list);
        list1.add(1);
        System.out.println(list1.peek());
        list1.add(2);
        list1.add(4);
        list1.add(5);
        list1.add(3);
        list1.poll();
        list1.removeFirst();
        System.out.println(list1);
    }
}
