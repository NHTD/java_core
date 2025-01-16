package java_core_9;

public class ThrowEx {
    public static void main(String[] args) {
        int age=17;
        if(age<18) {
            throw new RuntimeException("Age must be greater than 18");
        }
    }
}
