package java_core_12.Set;

import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("B");
        ts.add("A");
        ts.add("D");
        ts.add("C");

        ts.forEach(s -> System.out.print(s + " "));
        System.out.println();

        System.out.println("Lowest Value: " + ts.pollFirst());
        System.out.println("Highest Value: " + ts.pollLast());
    }
}
