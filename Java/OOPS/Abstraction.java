/*
 * 
 *  -- Abstraction -- 
 * *  Abstraction is the process of hiding the implementation details and showing only functionality to the user.
 * *  In other words, it shows only essential things to the user and hides the internal details, i.e., it shows what is necessary.
 * *  Abstraction can be achieved with either abstract classes or interfaces
 * 
 *  *  - Abstract Class:
 * *      1] An abstract class is a class that cannot be instantiated on its own and may contain abstract methods (methods without a body).
 * *      2] It can have both abstract and concrete methods (methods with a body).
 * *      3] Abstract classes are used when you want to provide a common base class with some shared implementation.
 * *      4] Use the 'abstract' keyword to declare an abstract class and its methods.
 * *      
 * *  *  - Interface:
 * *      1] An interface is a reference type in Java that can contain only abstract methods (until Java 8, after which default and static methods were introduced).
 * *      2] It cannot have any instance variables (except static and final variables).
 * *      3] Interfaces are used to define a contract that implementing classes must follow.
 * 
 * 
 * 
 * 
 */


abstract class Member{
    private String name;
    Member(String name){
        this.name = name;
    }
    abstract void WelcomeMessage();
}

class Student extends Member{
    private int studentId;

    Student(String name, int studentId){
        super(name);
        this.studentId = studentId;
    }

    @Override
    void WelcomeMessage() {
        System.out.println("Welcome Student..!");
    }
}

class Teacher extends Member{
    private int teacherId;

    Teacher(String name, int teacherId){
        super(name);
        this.teacherId = teacherId;
    }

    @Override
    void WelcomeMessage() {
        System.out.println("Welcome Teacher..!");
    }
}


public class Abstraction {
    public static void main(String[] args) {
        
        Member m1 = new Student("John", 101);
        Member m2 = new Teacher("Alice", 201);
 
        m1.WelcomeMessage();
        m2.WelcomeMessage();
    }
}
