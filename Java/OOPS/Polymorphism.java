/**
 * The Polymorphism class demonstrates the concept of polymorphism in Java.
 *
 * Polymorphism is a fundamental principle of object-oriented programming (OOP).
 * It allows objects of different classes to be treated as instances of a common superclass.
 *
 * In Java, polymorphism is commonly used when a parent class reference points to a child class object.
 * This enables dynamic method dispatch: the method that gets called is determined at runtime,
 * based on the actual type of the object.
 *
 * Typical examples of polymorphism include method overriding and interface implementation.
 */


// Compile-time Polymorphism (Method Overloading)
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

// Run-time Polymorphism (Method Overriding)
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Compile-time Polymorphism
        Calculator calc = new Calculator();
        System.out.println("Sum (int): " + calc.add(2, 3));
        System.out.println("Sum (double): " + calc.add(2.5, 3.5));

        // Run-time Polymorphism
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.sound(); // Animal makes a sound
        myDog.sound();    // Dog barks
        myCat.sound();    // Cat meows
    }
}