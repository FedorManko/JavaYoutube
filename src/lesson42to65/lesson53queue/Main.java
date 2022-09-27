package lesson42to65.lesson53queue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Comparator<Integer> comparator = Comparator.comparingInt(o -> o);
        Queue<Integer> queue1 = new PriorityQueue<>(comparator);
        queue.add("2");
        queue.offer("4");
        queue.add("1");
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue1.add(2);
        queue1.add(-5);
        queue1.add(3);
        queue1.add(1);
        System.out.println(queue1);
        List<String> list =(List<String>) queue;
        Collections.sort(list);
        System.out.println(list);
        while (queue1.size() > 0){
            System.out.println(queue1.poll());
        }
        Queue<String> stringQueue = new PriorityQueue<>();

    }
}
