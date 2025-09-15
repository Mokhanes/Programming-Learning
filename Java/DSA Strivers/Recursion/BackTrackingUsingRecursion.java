
import java.util.Scanner;

public class BackTrackingUsingRecursion {
    //N to 1 Using Back Tracking
    public static void printNto1(int n,int i){
        if(i>n) return;
        printNto1(n, i+1);
        System.out.print(i+" ");
    }

    //1 to N Using Back Tracking
    public static void print1toN(int n){
        if(n<1) return;
        print1toN(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        System.err.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Printing from N to 1 Using Back Tracking : ");
        printNto1(n, 1);
        
        System.out.println("Printing from 1 to N Using Back Tracking : ");
        print1toN(n);
    }
    
}
