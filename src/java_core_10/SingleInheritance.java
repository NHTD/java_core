package java_core_10;

public class SingleInheritance {
    static class Parent {
        void show() {
            System.out.println("This is the Parent class");
        }
    }

    static class Child extends Parent {
        void showChildren() {
            System.out.println("This is the Child class");
        }
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.showChildren();
        child.show();
    }
}
