package java_core_12.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();

        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");

        list1.forEach(s -> System.out.print(s + " "));
        System.out.println();

        List<String> list2 = new LinkedList<>();
        list2.add("E");
        list2.add("F");
        list2.add("G");
        list2.add("H");

        // Correspond list2 to list1
        list1.addAll(list2);

        list1.forEach(s -> System.out.print(s + " "));
        System.out.println();

        list1.addFirst("First");
        list1.addLast("End");

        list1.forEach(s -> System.out.print(s + " "));
        System.out.println();

        Iterator it = list1.listIterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
