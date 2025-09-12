/*
 * 
 * Encapsulation - Bindind of data ()
 * 
 * The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.
 * 
 *      Declare class variables/attributes as private
 *      Provide public get and set methods to access and update the value of a private variable
 * 
 *      private variables can only be accessed within the same class
 * 
 * 
 * Why Encapsulation?
 *       1] Better control of class attributes and methods
 *       2] Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
 *       3] Flexible: the programmer can change one part of the code without affecting other parts
 *       4] Increased security of data
 * 
 * 
 * 
 */

class Bank{
    private int AccNumber;
    private String AccName;
    private int Balance;

    Bank(int AccNumber, String AccName){
        this.AccNumber = AccNumber;
        this.AccName = AccName;
    }

    public void setBalance(int Amount){
        this.Balance = Amount;
    }

    public int getBalance() {
        return Balance;
    }

    
}

public class Encapsulation {
    public static void main(String[] args) {
        Bank mokhanes = new Bank(1001,"Mokhanes");
        mokhanes.setBalance(5000);
        System.out.println(mokhanes.getBalance());
    }

}
