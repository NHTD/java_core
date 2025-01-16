package java_core_10;

public class MultilevelInheritance {
    static class GrandParent {
        void showGrandParent() {
            System.out.println("This is the Grandparent class");
        }
    }

    static class Parent extends GrandParent {
        void showParent() {
            System.out.println("This is the Parent class");
        }
    }

    static class Child extends Parent {
        void showChild() {
            System.out.println("This is the Child class");
        }
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.showChild();
        child.showParent();
        child.showGrandParent();
    }
}
