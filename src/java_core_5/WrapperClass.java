package java_core_5;

public class WrapperClass {
    public static void main(String[] args) {
        System.out.println("=====Autoboxing=====");
        // Autoboxing: Chuyển int sang Integer
        int num = 10;
        Integer a = num;

        System.out.println("Primative data type: " + num);
        System.out.println("Wrapper class: " + a);

        System.out.println("=====Unboxing=====");
        // Unboxing: Chuyển Double sang kiểu nguyên thủy double
        Double wrapDouble = 20.5;
        double b = wrapDouble;

        System.out.println("Wrapper class: " + wrapDouble);
        System.out.println("Kiểu dữ liệu nguyên thủy: " + b);
    }
}
