package java_core_12.List;

import java.util.Scanner;
import java.util.Stack;

public class StackEx {
    public static int convertHexToBinary(int n) {
        Stack<Integer> stack = new Stack<>();
        int rs=0;

        while(n>0) {
            int digit = n%2;
            stack.push(digit);
            n/=2;
        }

        while (!stack.isEmpty()) {
            rs = rs * 10 + stack.pop();
        }

        return rs;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(convertHexToBinary(n));
    }
}
