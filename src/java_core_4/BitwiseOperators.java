package java_core_4;

/*
* 1 OR 0 = 1, 0 OR 1 = 1, 1 OR 1 = 1, 0 OR 0 = 0.
* 1 AND 0 = 0, 0 AND 1 = 0, 1 AND 1 = 1, 0 AND 0 = 0.
* */

public class BitwiseOperators {
    public static void main(String[] args) {
        int a=5; // 0101 (binary)
        int b=7; // 0111 (binary)

        /*
        * 0101
        * |
        * 0111
        * 0111 = 7
        * */
        System.out.println(a|b); // 7

        /*
         * 0101
         * &
         * 0111
         * 0101 = 5
         * */
        System.out.println(a&b); // 5

        /*
        * 0101
        * ^
        * 0111
        * 0010
        * */
        System.out.println(a^b); // 2

        /*
        * ~0101 = 1010 = -6
        * */
        System.out.println(~a); // -6


    }
}
