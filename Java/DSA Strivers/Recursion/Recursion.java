import java.util.*;

public class Recursion {

    public static void rec1toN(int n){
        if(n<=0) return;
        rec1toN(n-1);
        System.out.print(n+" ");
    }

    public static void recNto1(int n){
        if(n<=0) return;
        System.out.print(n+" ");
        recNto1(n-1);
    }

    public static int recsum(int n){
        if(n<=0) return 0;
        return n + recsum(n-1);
    }

    public static int recfact(int n){
        if(n<=0) return 1;
        return n * recfact(n-1);
    }

    public static void recReverseArray(int i,int arr[]){
        int n = arr.length;
        if(i>=(n-i-1)) return;
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
        recReverseArray(++i, arr);
    }

    public static boolean recPalindromCheck(int i,String s){
        int n = s.length();
        if(i>=(n-i-1)) return true;
        if(s.charAt(i) != s.charAt(n-i-1)) return false;
        return recPalindromCheck(++i, s);
    }

    public static int recNthFibanaciNumber(int n){
        if(n<=1) return n;
        return recNthFibanaciNumber(n-1) + recNthFibanaciNumber(n-2);
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 5;
        System.out.print("1 to N: ");
        rec1toN(n);
        System.out.println();
        System.out.print("N to 1: ");
        recNto1(n);
        System.out.println();

        System.out.println("Recursive Sum : "+recsum(n));

        System.out.println("Recursive Factorial : "+recfact(n));

        int arr[] = {1,2,3,4,5,6,7};

        System.out.print("Reversed Array: ");
        recReverseArray(0, arr);
        for(int i : arr) System.out.print(i+" ");

        String s = "madam";
        System.out.println("Recursive Palindrom Check: "+recPalindromCheck(0, s));

        System.out.println("Recursive Fibanaci Nth Number: "+recNthFibanaciNumber(4));
        // 0 1 1 2 3 5
    }
}
