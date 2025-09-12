
/*
 * Types of Inheritance in Java:
 * 
 * 1. Single Inheritance:
 *    - A class inherits from one superclass only.
 *    - Example: class Dog extends Animal
 * 
 * 2. Multilevel Inheritance:
 *    - A class inherits from a subclass, which in turn inherits from another superclass.
 *    - Example: class Puppy extends Dog, class Dog extends Animal
 * 
 * 3. Hierarchical Inheritance:
 *    - Multiple subclasses inherit from a single superclass.
 *    - Example: class Dog extends Animal, class Cat extends Animal
 * 
 * Note:
 * - Java does NOT support Multiple Inheritance (a class cannot extend more than one class) to avoid ambiguity.
 * - However, Java supports Multiple Inheritance through interfaces.
 */


/*
 * The Inheritance class serves as a basic example for understanding inheritance in Java.
 *
 * Inheritance is one of the core concepts of Object-Oriented Programming (OOP).
 * It allows a class (child/subclass) to acquire properties and behaviors (fields and methods)
 * from another class (parent/superclass).
 *
 * - Promotes code reuse and modularity.
 * - Supports method overriding for polymorphism.
 * - Java supports single inheritance (a class can extend only one class).
 * - Use the 'extends' keyword to inherit from a class.
 * - Constructors are not inherited.
 * 
 * subclass (child) - the class that inherits from another class
 * superclass (parent) - the class being inherited from
 *
 * Quick Recap:
 * - Inheritance enables hierarchical classification.
 * - Helps in reducing code duplication.
 * - Allows for dynamic method dispatch (runtime polymorphism).
 * - To inherit from a class, use the extends keyword.
 *
 * 
 * 
 * 
 * 
 */



// Superclass (Parent)
class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
    void eat() {
        System.out.println(name + " is eating.");
    }
}

// Subclass (Child) inheriting from Animal
class Dog extends Animal {

    Dog(String name) {
        super(name); // Call the constructor of the superclass (Animal)
    }

    void bark() {
        System.out.println(name + " is barking.");
    }
}

class Puppy extends Dog {
    int age;

    Puppy(String name, int age) {
        super(name); 
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + super.name); // using super to refer to parent class field
        super.bark(); // calling parent class method using super
        System.out.println("Age: " + age);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.eat();
        dog.bark();

        Puppy puppy = new Puppy("Max", 1);
        puppy.display();
    }
}
