package java_core_4;

public class ShiftOperators {
    public static void main(String[] args) {
        int a=5; // 0101
        int b=a<<1; // 1010
        System.out.println(a);

        int c=a>>1; // 0010
        System.out.println(c);

        int x=5;
        int d=x>>>1; // 0010
        System.out.println(d);
    }
}
