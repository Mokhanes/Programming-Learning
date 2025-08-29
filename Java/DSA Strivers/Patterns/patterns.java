import java.util.*;


public class patterns {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int num = sc.nextInt();
        sc.close();
        NumberPatterns np = new NumberPatterns();
        np.pattern1(num);
    }
}

class NumberPatterns {
    //Right Angled Triangle
    public void pattern1(int n) { 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((j+1) + " ");
            }
            System.out.println();
        }
    }

    //Floyd's Triangle
    public void pattern2(int n) { 
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

}

class StarPatterns {
    //Right Angled Triangle
    public void pattern1(int n) { 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
