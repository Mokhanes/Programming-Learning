
import java.util.*;


public class BasicMaths {
    public static int countDigit(int n){
        int count = 0;
        while(n!=0){
            n = n/10;
            count++;
        }
        return count;
    }

    public static int reverseNumber(int n){
        int rev = 0;
        while(n!=0){
            int lastDigit = n%10;
            rev = rev*10 + lastDigit;
            n = n/10;
        }
        return rev;
    }

    public static boolean palindrome(int n){
        return n == reverseNumber(n);
    }

    public static int findGCD(int a, int b){
        if(b==0) return a;
        return findGCD(b, a%b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Number of digits in " + n + " is: " + countDigit(n));
        sc.close();
    }
}
