public class java_core_2 { // class
    public static int a; // static variable
    private final int b = 123; // final variable
    String name; // instance variable

    /**
     * This method return a String
     * */
    public static String makeSound() {
        return "Sound";
    }

    public static void method() {
        int a; // local variable
    }

    public static void main(String[] args) {
        java_core_2 dog = new java_core_2(); // object dog
        System.out.println(dog.makeSound());
    }
}
