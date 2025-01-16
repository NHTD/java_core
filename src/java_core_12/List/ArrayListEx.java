package java_core_12.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List<Integer> list = new java.util.ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.stream().forEach(i -> System.out.print(i + " "));
        System.out.println();

        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");

        Iterator it = list1.iterator();
        while(it.hasNext()) {
            System.out.print(it.next()+" ");
        }
    }
}
