
/*
 * Java - What is OOP?
 *      * OOP stands for Object-Oriented Programming.
 *      * Procedural programming is about writing procedures or methods that perform operations on the data, while
 *      object-oriented programming is about creating objects that contain both data and methods.
 *      *Object-oriented programming has several advantages over procedural programming:
 *      
 *      OOP is faster and easier to execute
 *      OOP provides a clear structure for the programs
 *      OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
 *      OOP makes it possible to create full reusable applications with less code and shorter development time
 * 
 * Java - What are Classes and Objects?
 * 
 *      Class - BluePrint of the Object
 *      Object - It's Instance of the class
 *          Object have Attributes/Fields and Methods
 * 
 *      Accessing Attributes --> You can access attributes by creating an object of the class by using the dot syntax (.): 
 * 
 * 
 * Class Nameing Conversions:
 *          
 *        1] PascalCase (UpperCamelCase): Ex: MyClass  - Java classes and interfaces.
 *        2] camelCase (lowerCamelCase):  Ex: calculateTotal  - methods and variables 
 *        3] SNAKE_CASE (Uppercase with Underscores):  Ex: MAX_VALUE - naming constants (final variables) 
 *        4] kebab-case (Lowercase with Hyphens): Ex: user-profile-page  - web development for CSS classes or file names.
 * 
 * 
 * Four Pillars of OOPS:
 * 
 *      1] Encapsulation:
 *      2] Inheritance:
 *      3] Polymorphism:
 *      4] Abstraction:
 * 
 * This  Keyword:
 *      this Keyword - The 'this' keyword in Java refers to the current object in a method or constructor.
 *      You can also use this() to call another constructor in the same class.
 * 
 * Access Modifiers:
 *      1] Access Modifiers - controls the access level
 *      2] Non-Access Modifiers - do not control access level, but provides other functionality
 * 
 * 
 * 
 * 
 */


import java.util.Scanner;

class Bank{
    private String AccHolderName;
    private int AccNumber;
    private int Balance;

    Bank(int AccNumber, String AccHolderName){
        this.AccNumber = AccNumber;
        this.AccHolderName = AccHolderName;
    }

    void deposit(int Amount){
        this.Balance = Amount;
    }

    void withdraw(int Amount){
        if(this.Balance < Amount) System.out.println("Insuficent Balance..!");
        Balance = Balance - Amount;
        System.out.println("Amount : " + Amount + " Withdraw Successfully..!");
    }

    int checkBalance(){
        return this.Balance;
    }

    void displayDetails(){
        System.out.println("Account Number : " + this.AccNumber);
        System.out.println("Account Holder Name : " + this.AccHolderName);
        System.out.println("Current Balance : " + this.Balance);
    }

 }

 public class Intro{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bank mokhanes = new Bank(1111, "Mokhanes");
        mokhanes.deposit(10000);
        mokhanes.withdraw(4000);
        System.out.println(mokhanes.checkBalance());
        mokhanes.displayDetails();


        Bank sanjayKumar = new Bank(1112, "SanjayKumar");
        sanjayKumar.deposit(10000);
        sanjayKumar.withdraw(2000);
        System.out.println(sanjayKumar.checkBalance());
        sanjayKumar.displayDetails();
        
    }
 }