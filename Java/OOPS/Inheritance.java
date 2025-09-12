
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
 *  -- Dynamic binding -> Stroing Drived casss object in the base class reference variable
 * 
 * 
 */

import java.util.Scanner;

class Employeee{
    private String name;
    private int salary;

    Employeee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}

class Manager extends Employeee{
    private int Bonus;

    Manager(String name, int salary, int Bonus){
        super(name, salary);
        this.Bonus = Bonus;
    }

    public int getBonus() {
        return Bonus;
    }

    public void setBonus(int bonus) {
        Bonus = bonus;
    }

    @Override
    public int getSalary(){
        return super.getSalary() + this.Bonus;
    }

}



public class Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Salary : ");
        int salary = sc.nextInt();

        Employeee emp = new Employeee(name, salary);

        System.out.println("Employee Name : " + emp.getName());
        System.out.println("Employee Salary : " + emp.getSalary());

        Manager m1 = new Manager("Mokhanes", 50000, 10000);
        System.out.println("Manager Name : " + m1.getName());
        System.out.println("Manager Salary : " + m1.getSalary());

        sc.close();
    }
}
