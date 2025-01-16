package java_core_6;

import java.util.Scanner;

public class StringEx {

    // Hello World => olleH dlroW

    /**
     *
     * @param s a input String
     * @return a String that is reversed word by word from the original String
     */
    public static String reverseEachWordInString(String s) {
        StringBuilder sb = new StringBuilder();
        for(String word : s.split(" ")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(word).reverse();
            sb.append(sb2 + " ");
        }
        sb.setLength(sb.length()-1);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseEachWordInString(s));

        System.out.println("==== equal() vs == operator =====");
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1==s2); // true (cùng tham chiếu trong pool)
        System.out.println(s1==new String("abc")); // false (khác tham chiếu)
        System.out.println(s1.equals("abc")); // true (equals so sánh giá trị)
    }
}
