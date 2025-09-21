
import java.util.*;


public class ArrayManipulation {
    public static void findLargestAndSmallest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }

    public static void secondLargestAndSmallest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }

            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        System.out.println("Second Largest: " + (secondLargest == Integer.MIN_VALUE ? "Not found" : secondLargest));
        System.out.println("Second Smallest: " + (secondSmallest == Integer.MAX_VALUE ? "Not found" : secondSmallest));
    }

    public static void checkArrayIsSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                System.out.println("Array is not sorted");
                return;
            }
        }
        System.out.println("Array is sorted");
    }

    public static void removeDuplicates(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        findLargestAndSmallest(arr);
        secondLargestAndSmallest(arr);
        checkArrayIsSorted(arr);
        removeDuplicates(arr);
        sc.close();
    }
}
