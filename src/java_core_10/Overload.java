package java_core_10;

public class Overload {
    static int convertToInteger(float n) {
        return (int)n;
    }

    static int convertToInteger(double n) {
        return (int) n;
    }

    static int convertToInteger(char c) {
        return c-'0';
    }

    static float convertToInteger(int n) {
        return (float) n;
    }

    public static void main(String[] args) {
        int a=1;
        float b=1f;
        double c=1d;
        char d='1';

        System.out.println(convertToInteger(a));
        System.out.println(convertToInteger(b));
        System.out.println(convertToInteger(c));
        System.out.println(convertToInteger(d));
    }
}
