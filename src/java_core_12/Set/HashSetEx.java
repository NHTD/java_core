package java_core_12.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(4);
        set.add(5);

        set.forEach(n -> System.out.print(n + " "));
        System.out.println();

        if(set.contains(2)) {
            System.out.println("2 is existed in set");
        }
    }
}
