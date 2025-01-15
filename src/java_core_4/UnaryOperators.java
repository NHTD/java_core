package java_core_4;

public class UnaryOperators {
    public static void main(String[] args) {
        int a=10;
        int b = a--; // b=10 , a=9

        int x=10;
        int y=--x; // y=9, x=9

        int h = 3;
        int result = h++ * 2 + --h; // result=9, h=3
    }
}
