package java_core_10.Override;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();

        Animal animal = new Animal();
        animal.makeSound();
    }
}
