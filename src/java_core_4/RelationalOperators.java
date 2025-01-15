package java_core_4;

public class RelationalOperators {
    public static void main(String[] args) {
        int a=5;
        int b=7;
        if(a>b) {
            System.out.println("a lớn hơn b");
        } else {
            System.out.println("a nhỏ hơn b");
        }

        if(a<b) {
            System.out.println("b lớn hơn a");
        } else {
            System.out.println("b nhỏ hơn a");
        }

        if(a!=b) {
            System.out.println("a khác b");
        } else if(a==b) {
            System.out.println("a bằng b");
        }

        if(a>=b) {
            System.out.println("a >= b");
        } else if(a<=b) {
            System.out.println("a <= b");
        }
    }
}
