package java_core_4;

public class LogicalOperators {
    public static void main(String[] args) {
        int point=8;
        if(point>=7 && point<=8) {
            System.out.println("Khá");
        } else if(point>8) {
            System.out.println("Giỏi");
        } else {
            System.out.println("TB");
        }

        int a=5;
        int b=7;
        if (a > 3 || b < 6) {
            System.out.println("Điều kiện đúng");
        } else {
            System.out.println("Điều kiện sai");
        }

        boolean flag = false;
        if(!flag) {
            System.out.println("True");
        }
    }
}
