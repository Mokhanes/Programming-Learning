
import java.util.*;


public class BasicMaths {
    // Count number of digits in a number
    public static int countDigit(int n){
        int count = 0;
        while(n!=0){
            n = n/10;
            count++;
        }
        return count;
    }

    // Reverse a number
    public static int reverseNumber(int n){
        int rev = 0;
        while(n!=0){
            int lastDigit = n%10;
            rev = rev*10 + lastDigit;
            n = n/10;
        }
        return rev;
    }

    // Check if a number is palindrome
    public static boolean palindrome(int n){
        return n == reverseNumber(n);
    }

    // Find GCD of two numbers
    public static int findGCD(int a, int b){
        if(b==0) return a;
        return findGCD(b, a%b);
    }

    // Check if a number is Armstrong number
    public static boolean amstrong(int n){
        int original = n;
        int sum = 0;
        int digits = countDigit(n);
        while(n!=0){
            int lastDigit = n%10;
            sum += Math.pow(lastDigit, digits);
            n = n/10;
        }
        return sum == original;
    }

    // Print all divisors of a number
    public static void divisors(int n){
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                System.out.print(i + " ");
            }
        }
    }

    // Check if a number is prime
    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2; i<=Math.sqrt(n); i++){ // i*i<=n
            if(n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number: ");
        // int n = sc.nextInt();
        // System.out.print("Number of digits in " + n + " is: " + countDigit(n));
        // sc.close();
        //System.out.print(findGCD(126,162));
    }
}
