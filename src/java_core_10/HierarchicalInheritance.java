package java_core_10;

public class HierarchicalInheritance {
    static class Parent {
        void showParent() {
            System.out.println("This is the Parent class");
        }
    }

    static class Child1 extends Parent {
        void showChild1() {
            System.out.println("This is the Child 1 class");
        }
    }

    static class Child2 extends Parent {
        void showChild2() {
            System.out.println("This is the Child 2 class");
        }
    }

    public static void main(String[] args) {
        Child1 child1 = new Child1();
        child1.showChild1();
        child1.showParent();

        Child2 child2 = new Child2();
        child2.showChild2();
        child2.showParent();
    }
}
