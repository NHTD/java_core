package java_core_12.Queue;

import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(3);
        pq.add(2);
        pq.add(8);
        pq.add(4);

        pq.forEach(i -> System.out.print(i + " "));
        System.out.println();
        System.out.println("First element: " + pq.poll());

        pq.offer(1);
        pq.forEach(i -> System.out.print(i + " "));
    }
}
